package com.orange_yishenggong.humanbeingmodels.service;

import com.orange_yishenggong.humanbeingmodels.environment.SocialNetworkEnv;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Orange Meow
 */
@Service
public class SocialNetworkService {
    @Resource
    private SocialNetworkEnv env;

    public String run(String token, int gridLength, int population, int rounds,int recomType) {
        StringBuilder sb = new StringBuilder();
        sb.append(token+",");
        sb.append(gridLength+",");
        sb.append(population+",");
        sb.append(rounds+",");
        sb.append(recomType+".");

        env.setToken(token);
        env.setLogId(MDC.get("LOG_ID"));
        env.setGridLength(gridLength);
        env.setPopulation(population);
        env.setRounds(rounds);
        env.setRecomType(recomType);
        env.initializeEnv();
        env.runNetwork();
        return sb.toString();
    }
}
