package com.develhope.deploy_environment2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {
    // parameters
    @Autowired
    private Environment environment;

    @Value("${myCustomVarTree.welcomeMsg}")
    private String myCustomVar;

    @GetMapping
    public String test(){
        String test = environment.getProperty("myCustomVarTree.welcomeMsg");
        return test;
    }

    @GetMapping
    public String prod(){
        return myCustomVar;
    }
}
