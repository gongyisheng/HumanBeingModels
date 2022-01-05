package com.orange_yishenggong.humanbeingmodels.service;

import com.orange_yishenggong.humanbeingmodels.domain.OdsSocialnetworkModelParameterOriginLog;
import com.orange_yishenggong.humanbeingmodels.domain.OdsSocialnetworkModelRuntimeOriginLog;
import com.orange_yishenggong.humanbeingmodels.environment.SocialNetworkEnv;
import com.orange_yishenggong.humanbeingmodels.mapper.OdsSocialnetworkModelParameterOriginLogMapper;
import com.orange_yishenggong.humanbeingmodels.mapper.OdsSocialnetworkModelRuntimeOriginLogMapper;
import com.orange_yishenggong.humanbeingmodels.util.MathUtil;
import com.orange_yishenggong.humanbeingmodels.util.SnowFlake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Orange Meow
 */
@Service
public class SocialNetworkService {
    @Resource
    private SnowFlake snowFlake;
    @Resource
    private SocialNetworkEnv env;
    @Resource
    private WsService wsService;
    @Resource
    private OdsSocialnetworkModelParameterOriginLogMapper parameterLogMapper;
    @Resource
    private OdsSocialnetworkModelRuntimeOriginLogMapper runtimeLogMapper;
    private static final Logger LOG = LoggerFactory.getLogger(SocialNetworkService.class);

    private OdsSocialnetworkModelParameterOriginLog buildParameterLog(long modelId, int gridLength, int population, int rounds, int recomType, long startTime){
        OdsSocialnetworkModelParameterOriginLog parameterLog = new OdsSocialnetworkModelParameterOriginLog();
        parameterLog.setModelId(modelId);
        parameterLog.setGridLength(gridLength);
        parameterLog.setPopulation(population);
        parameterLog.setRounds(rounds);
        parameterLog.setRecomType(recomType);
        parameterLog.setStartTime(startTime);
        return parameterLog;
    }

    private OdsSocialnetworkModelRuntimeOriginLog buildRunTimeLog(long modelId, int round, double averageScore, int recomCount){
        OdsSocialnetworkModelRuntimeOriginLog runtimeLog = new OdsSocialnetworkModelRuntimeOriginLog();
        runtimeLog.setModelId(modelId);
        runtimeLog.setRound(round);
        runtimeLog.setAverageScore(averageScore);
        runtimeLog.setRecomCount(recomCount);
        return runtimeLog;
    }

    private void buildWsMessage(StringBuilder wsMessage, int round, double averageScore, int recomCount, char valSeg, char msgSeg){
        wsMessage.append(round);
        wsMessage.append(valSeg);
        wsMessage.append(MathUtil.round(averageScore,3));
        wsMessage.append(valSeg);
        wsMessage.append(recomCount);
        wsMessage.append(msgSeg);
    }

    public String run(String token, int gridLength, int population, int rounds,int recomType) {
        long modelId = snowFlake.nextId();
        String logId = MDC.get("LOG_ID");
        long startTime = System.currentTimeMillis();
        //websocket allows message size<128KB or it will cause fragment
        int wsMsgSize = rounds/200+1;
        StringBuilder wsMessage = new StringBuilder();

        //initialize the environment
        env.setGridLength(gridLength);
        env.setPopulation(population);
        env.setRecomType(recomType);

        env.initializeEnv();

        //insert parameter data
        OdsSocialnetworkModelParameterOriginLog parameterLog = buildParameterLog(modelId,gridLength,population,rounds,recomType,startTime);
        parameterLogMapper.insert(parameterLog);

        LOG.info("StartRunning:"+(double)(System.currentTimeMillis()-startTime)/1000+"s");
        try{
            for(int i=0;i<rounds;i++){
                env.runNetworkOnce();
                double averageScore = MathUtil.calcAverage(env.getScores());

                OdsSocialnetworkModelRuntimeOriginLog runtimeLog = buildRunTimeLog(modelId,i,averageScore,env.getRecomCount());
                runtimeLogMapper.insert(runtimeLog);

                buildWsMessage(wsMessage,i,averageScore,env.getRecomCount(),',','#');
                if(i%wsMsgSize==0||i==rounds-1){
                    wsMessage.deleteCharAt(wsMessage.length()-1);
                    wsService.sendInfo(token,wsMessage.toString(),logId);
                    wsMessage.setLength(0);
                }
            }
        }catch(Exception e){
            LOG.error("RunTimeError"+e.getMessage());
        }
        LOG.info("EndRunning:"+(double)(System.currentTimeMillis()-startTime)/1000+"s");

        return "success";
    }
}
