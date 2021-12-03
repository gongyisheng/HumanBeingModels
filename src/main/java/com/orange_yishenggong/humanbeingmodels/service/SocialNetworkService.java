package com.orange_yishenggong.humanbeingmodels.service;

import org.springframework.stereotype.Service;

@Service
public class SocialNetworkService {
    public String run(int explorerNum, int gridLength, int rounds,int recommendType){
        StringBuilder sb = new StringBuilder();
        sb.append(explorerNum+",");
        sb.append(gridLength+",");
        sb.append(rounds+",");
        sb.append(recommendType+".");
        return sb.toString();
    }
}
