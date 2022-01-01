package com.orange_yishenggong.humanbeingmodels.environment;

import com.orange_yishenggong.humanbeingmodels.initializer.RandomInitializer;
import com.orange_yishenggong.humanbeingmodels.model.role.Explorer;
import com.orange_yishenggong.humanbeingmodels.service.WsService;
import com.orange_yishenggong.humanbeingmodels.util.Direction;
import com.orange_yishenggong.humanbeingmodels.util.EncoderAndDecoder;
import com.orange_yishenggong.humanbeingmodels.util.MathFunc;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Orange Meow
 */
@Service
public class SocialNetworkEnv {
    private String token;
    private String logId;
    private int gridLength;
    private int population;
    private int rounds;
    private Explorer[] explorers;
    private double[] isRecommended;
    private double[] scores;

    /**
     * 0: no recommendation, 1: single-side exchange, 2: double-side exchange
     */
    private int recomType;
    private int recomCount;
    private int turningPoint;

    @Resource
    private WsService wsService;

    public int getGridLength() {
        return gridLength;
    }

    public void setGridLength(int gridLength) {
        this.gridLength = gridLength;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public int getRecomType() {
        return recomType;
    }

    public void setRecomType(int recomType) {
        this.recomType = recomType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public void initializeEnv(){
        this.explorers = new Explorer[this.population];
        this.isRecommended = new double[this.population];
        this.scores = new double[this.population];
        for(int i=0;i<this.population;i++){
            Explorer e = new Explorer();
            e.setM(this.gridLength);
            e.setN(this.gridLength);
            e.initializeTargetMap();
            e.initializeVisitedMap();
            e.setTargetMap(RandomInitializer.doubleMap(this.gridLength,this.gridLength));
            e.setX(RandomInitializer.randPos(0,this.gridLength));
            e.setY(RandomInitializer.randPos(0,this.gridLength));
            explorers[i] = e;
            scores[i] = e.getCurrTargetMapVal();
        }
        System.out.println("initializeEnv success");
    }

    private void selfExplore(Explorer e){
        int x = e.getX();
        int y = e.getY();
        for(int j=0;j<4;j++){
            int newX = x+ Direction.fourDir[j];
            int newY = y+ Direction.fourDir[j+1];
            e.addToQueue(newX,newY);
        }
        e.visit();
    }

    private void exchangeInfo(Explorer e1, Explorer e2){
        for(int i=0;i<this.gridLength;i++){
            for(int j=0;j<this.gridLength;j++){
                if(e1.getVisitedMap(i,j)==2){
                    e2.addToQueue(i,j);
                }
            }
        }
    }

    private boolean isTurningPoint(int round, double averageScore){
        return Math.abs((double)(this.rounds-round)/this.rounds-averageScore)<0.001;
    }

    public void runNetwork(){
        this.turningPoint = 0;
        for(int i=0;i<this.rounds;i++){
            Map<String, List<Integer>> map = new HashMap<>();
            this.recomCount = 0;

            //self-explore
            for(int j=0;j<this.population;j++){
                Explorer e = explorers[j];
                selfExplore(e);
                scores[j] = e.getCurrTargetMapVal();

                String encodedPos = EncoderAndDecoder.posEncoder(e.getX(),e.getY(),"#");
                map.putIfAbsent(encodedPos,new ArrayList<>());
                map.get(encodedPos).add(j);
            }

            //meet-and-make-recommendation
            for(String encodedPos: map.keySet()){
                int[] pos = EncoderAndDecoder.posDecoder(encodedPos,"#");
                List<Integer> list = map.get(encodedPos);
                for(int j=0;j<list.size();j++){
                    for(int k=j+1;k<list.size();k++){
                        Explorer e1 = this.explorers[list.get(j)];
                        Explorer e2 = this.explorers[list.get(k)];
                        if(this.recomType>0){
                            double p = Math.random();
                            if(p>0.5){
                                exchangeInfo(e1,e2);
                                this.isRecommended[k]++;
                            }else{
                                exchangeInfo(e2,e1);
                                this.isRecommended[j]++;
                            }
                            if(recomType>1){
                                if(p>0.5){
                                    exchangeInfo(e2,e1);
                                    this.isRecommended[j]++;
                                }else{
                                    exchangeInfo(e1,e2);
                                    this.isRecommended[k]++;
                                }
                            }
                        }
                        this.recomCount += recomType;
                    }
                }
            }

            //change turning point
            double averageScore = MathFunc.calcAverage(this.scores);
            if(turningPoint==0&&isTurningPoint(i,averageScore)){
                this.turningPoint = i;
            }

            //send message
            String info = i+"," + MathFunc.round(averageScore,3) + "," + this.recomCount + "," + this.turningPoint;
            wsService.sendInfo(token,info,logId);
        }
    }
}
