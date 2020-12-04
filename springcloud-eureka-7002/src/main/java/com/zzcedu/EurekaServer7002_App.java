package com.zzcedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Evan
 * @Date: 2020/12/2 14:31
 */
@SpringBootApplication

@EnableEurekaServer
public class EurekaServer7002_App {

    public static void main(String[] args)

    {

        SpringApplication.run(EurekaServer7002_App.class, args);

    }

}
