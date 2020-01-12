package com.aop.demo.controller;

import com.aop.demo.service.AopInterface;

import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/aop")
public class AopController {

    @Autowired
    private AopInterface aopService;

    @GetMapping("/test/{id}")
    public String aopTest(@PathVariable String id){
        String result = aopService.testServcie(id);
        System.out.println("result ="+result);
        return result+"success";
    }
}
