package com.mirro.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mirro on 2017/8/31.
 */
@Component
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry "+name;
    }
}
