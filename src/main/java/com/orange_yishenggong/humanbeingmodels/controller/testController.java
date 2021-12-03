package com.orange_yishenggong.humanbeingmodels.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.orange_yishenggong.humanbeingmodels.service.testService;

import javax.annotation.Resource;

@RestController
public class testController {
    @Resource
    private testService testService;

    //private static final Logger Log = LoggerFactory.getLogger(testController.class);

    @GetMapping("/test")
    public String test(){
        return testService.test();
    }

}
