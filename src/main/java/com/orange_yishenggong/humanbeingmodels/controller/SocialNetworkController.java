package com.orange_yishenggong.humanbeingmodels.controller;

import com.orange_yishenggong.humanbeingmodels.service.SocialNetworkService;
import com.orange_yishenggong.humanbeingmodels.req.runSocailNetworkReq;
import com.orange_yishenggong.humanbeingmodels.resp.CommonResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/socialNetwork")
public class SocialNetworkController {
    @Resource
    private SocialNetworkService service;

    @PostMapping("/run")
    public CommonResp run(@Valid @RequestBody runSocailNetworkReq req){
        CommonResp<String> resp = new CommonResp<>();
        String str = service.run(req.getExplorerNum(),req.getGridLength(),req.getRounds(),req.getRecommendType());
        resp.setContent(str);
        return resp;
    }
}
