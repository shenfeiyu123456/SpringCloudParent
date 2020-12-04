package com.zzcedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: Evan
 * @Date: 2020/12/4 15:54
 */
@SpringBootApplication

@EnableConfigServer

public class Config_3344_StartSpringCloudApp

{

    public static void main(String[] args)

    {

        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);

    }

}