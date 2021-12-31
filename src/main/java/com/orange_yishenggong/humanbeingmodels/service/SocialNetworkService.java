package com.orange_yishenggong.humanbeingmodels.service;

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
    private static final Logger LOG = LoggerFactory.getLogger(SocialNetworkService.class);
    @Resource
    private WsService wsService;
    public String run(String token, int gridLength, int population, int rounds,int recomType) {
        StringBuilder sb = new StringBuilder();
        sb.append(token+",");
        sb.append(gridLength+",");
        sb.append(population+",");
        sb.append(rounds+",");
        sb.append(recomType+".");
        String log_id = MDC.get("LOG_ID");
        for(int i=0;i<10;i++){
            wsService.sendInfo(token,"1,2,3",log_id);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
