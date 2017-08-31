package com.mirro.controller;

import com.mirro.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mirro on 2017/8/31.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return helloService.sayHiFromClientOne(name);
    }

}
