package com.orange_yishenggong.humanbeingmodels.controller;

import com.orange_yishenggong.humanbeingmodels.service.SocialNetworkService;
import com.orange_yishenggong.humanbeingmodels.req.RunSocailNetworkReq;
import com.orange_yishenggong.humanbeingmodels.resp.CommonResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author Orange Meow
 */
@RestController
@RequestMapping("/socialNetwork")
public class SocialNetworkController {
    @Resource
    private SocialNetworkService service;

    @PostMapping("/run")
    public CommonResp run(@Valid @RequestBody RunSocailNetworkReq req){
        CommonResp<String> resp = new CommonResp<>();
        String str = service.run(req.getToken(),req.getGridLength(),req.getPopulation(),req.getRounds(),req.getRecomType());
        resp.setContent(str);
        return resp;
    }
}
