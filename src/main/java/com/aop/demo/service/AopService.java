package com.aop.demo.service;

import com.aop.demo.annotation.JoinAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class AopService implements AopInterface{

    @JoinAnnotation
    public String testServcie(String id){
        System.out.println("方法运行中:"+id);
        return "service"+id;
    }
}
