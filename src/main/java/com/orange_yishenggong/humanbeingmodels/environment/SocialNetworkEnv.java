package com.orange_yishenggong.humanbeingmodels.environment;

import com.orange_yishenggong.humanbeingmodels.initializer.RandomInitializer;
import com.orange_yishenggong.humanbeingmodels.model.role.Explorer;
import com.orange_yishenggong.humanbeingmodels.util.DirectionUtil;
import com.orange_yishenggong.humanbeingmodels.util.EncoderAndDecoderUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Orange Meow
 */
@Service
public class SocialNetworkEnv {
    private int gridLength;
    private int population;
    /**
     * 0: no recommendation, 1: single-side exchange, 2: double-side exchange
     */
    private int recomType;

    private Explorer[] explorers;
    private double[] scores;
    private double[] isRecommended;
    private int recomCount;

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

    public int getRecomType() {
        return recomType;
    }

    public void setRecomType(int recomType) {
        this.recomType = recomType;
    }

    public double[] getScores() { return scores; }

    public int getRecomCount() { return recomCount; }

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
            int newX = x+ DirectionUtil.fourDir[j];
            int newY = y+ DirectionUtil.fourDir[j+1];
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

    public void runNetworkOnce(){
        Map<String, List<Integer>> map = new HashMap<>(this.population*3/4+1);
        this.recomCount = 0;

        //self-explore
        for(int i=0;i<this.population;i++){
            Explorer e = explorers[i];
            selfExplore(e);
            scores[i] = e.getCurrTargetMapVal();

            String encodedPos = EncoderAndDecoderUtil.posEncoder(e.getX(),e.getY(),"#");
            map.putIfAbsent(encodedPos,new ArrayList<>());
            map.get(encodedPos).add(i);
        }

        //meet-and-make-recommendation
        for(String encodedPos: map.keySet()){
            List<Integer> list = map.get(encodedPos);
            for(int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    Explorer e1 = this.explorers[list.get(i)];
                    Explorer e2 = this.explorers[list.get(j)];
                    if(this.recomType>0){
                        double p = Math.random();
                        if(p>0.5){
                            exchangeInfo(e1,e2);
                            this.isRecommended[j]++;
                        }else{
                            exchangeInfo(e2,e1);
                            this.isRecommended[i]++;
                        }
                        if(recomType>1){
                            if(p>0.5){
                                exchangeInfo(e2,e1);
                                this.isRecommended[i]++;
                            }else{
                                exchangeInfo(e1,e2);
                                this.isRecommended[j]++;
                            }
                        }
                    }
                    this.recomCount += recomType;
                }
            }
        }
    }
}
