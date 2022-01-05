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

    public String run(String token, int gridLength, int population, int rounds,int recomType) {
        long modelId = snowFlake.nextId();
        String logId = MDC.get("LOG_ID");
        long startTime = System.currentTimeMillis();

        env.setGridLength(gridLength);
        env.setPopulation(population);
        env.setRecomType(recomType);

        env.initializeEnv();
        OdsSocialnetworkModelParameterOriginLog parameterLog = buildParameterLog(modelId,gridLength,population,rounds,recomType,startTime);
        parameterLogMapper.insert(parameterLog);
        LOG.info("StartRunning:"+(double)(System.currentTimeMillis()-startTime)/1000+"s");
        try{
            for(int i=0;i<rounds;i++){
                env.runNetworkOnce();
                double averageScore = MathUtil.calcAverage(env.getScores());

                String info = i+","+ MathUtil.round(averageScore,3) + "," + env.getRecomCount() + "," + 0;
                OdsSocialnetworkModelRuntimeOriginLog runtimeLog = buildRunTimeLog(modelId,i,averageScore,env.getRecomCount());
                runtimeLogMapper.insert(runtimeLog);
                wsService.sendInfo(token,info,logId);
            }
        }catch(Exception e){
            LOG.error("RunTimeError"+e.getMessage());
        }
        LOG.info("EndRunning:"+(double)(System.currentTimeMillis()-startTime)/1000+"s");

        return "success";
    }
}
