package com.sumitaccess007.SprintFirstApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DBConfiguration {

    @Bean
    @Profile("DEV")
    public void setupDEVDB(){
        System.out.println("In DEV Env");
    }

    @Bean
    @Profile("QA")
    public void setupQADB(){
        System.out.println("In QA Env");
    }

    @Bean
    @Profile("UAT")
    public void setupUATDB(){
        System.out.println("In UAT Env");
    }

    @Bean
    @Profile("PROD")
    public void setupPRODDB(){
        System.out.println("In PROD DB");
    }
}
