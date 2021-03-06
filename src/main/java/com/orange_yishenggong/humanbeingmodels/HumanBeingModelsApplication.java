package com.orange_yishenggong.humanbeingmodels;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Orange Meow
 */
@ComponentScan("com.orange_yishenggong")
@SpringBootApplication
@MapperScan("com.orange_yishenggong.humanbeingmodels.mapper")
@EnableScheduling
@EnableAsync
public class HumanBeingModelsApplication {
    private static final Logger LOG = LoggerFactory.getLogger(HumanBeingModelsApplication.class);
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HumanBeingModelsApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("Application Start Now\t:)");
        LOG.info("IP Address:\thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
