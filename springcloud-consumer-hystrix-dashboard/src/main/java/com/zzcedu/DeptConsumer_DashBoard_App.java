package com.zzcedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: Evan
 * @Date: 2020/12/3 17:20
 */
@SpringBootApplication

@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App

{

    public static void main(String[] args)

    {

        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);

    }

}

