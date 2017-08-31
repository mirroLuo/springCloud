package com.mirro.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mirro on 2017/8/31.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client-1/hi?name="+name,String.class);
    }

    public String helloError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
