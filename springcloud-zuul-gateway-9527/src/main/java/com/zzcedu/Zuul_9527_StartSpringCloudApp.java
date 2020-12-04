package com.zzcedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: Evan
 * @Date: 2020/12/4 14:32
 */
@SpringBootApplication

@EnableZuulProxy

public class Zuul_9527_StartSpringCloudApp

{

    public static void main(String[] args)

    {

        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);

    }

}

