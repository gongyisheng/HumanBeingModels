package com.orange_yishenggong.humanbeingmodels.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.orange_yishenggong.humanbeingmodels.service.TestService;

import javax.annotation.Resource;

@RestController
public class testController {
    @Resource
    private TestService testService;

    //private static final Logger Log = LoggerFactory.getLogger(testController.class);

    @GetMapping("/test")
    public String test(){
        return testService.test();
    }

}
