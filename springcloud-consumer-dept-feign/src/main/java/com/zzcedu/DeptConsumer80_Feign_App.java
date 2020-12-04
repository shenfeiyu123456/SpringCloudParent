package com.zzcedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Evan
 * @Date: 2020/12/3 14:31
 */
@SpringBootApplication

@EnableEurekaClient

@EnableFeignClients(basePackages= {"com.zzcedu"})

public class DeptConsumer80_Feign_App

{

    public static void main(String[] args)

    {

        SpringApplication.run(DeptConsumer80_Feign_App.class, args);

    }

}



