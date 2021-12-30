package com.orange_yishenggong.humanbeingmodels.service;

import org.springframework.stereotype.Service;

@Service
public class SocialNetworkService {
    public String run(int gridLength, int population, int rounds,int recomType){
        StringBuilder sb = new StringBuilder();
        sb.append(gridLength+",");
        sb.append(population+",");
        sb.append(rounds+",");
        sb.append(recomType+".");
        return sb.toString();
    }
}
