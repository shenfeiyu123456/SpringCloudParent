package com.zzcedu.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Evan
 * @Date: 2020/12/1 15:53
 */
@Configuration

public class ConfigBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()

    {

        return new RestTemplate();

    }
//    @Bean
//    public IRule myrule(){
////        return new RoundRobinRule(); //轮询
//        return new RandomRule(); //随机
//    }
}