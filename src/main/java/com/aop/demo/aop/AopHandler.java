package com.aop.demo.aop;

import com.aop.demo.annotation.JoinAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopHandler {



//    @Around("execution(* com.aop.demo.service.AopService.testServcie(..))")

    @Around(value = "@annotation(around)")
    public Object processAuthority(ProceedingJoinPoint point,JoinAnnotation around) throws Throwable{
        Signature signature = point.getSignature();
        Object[] args = point.getArgs();
        System.out.println("方法执行前："+args[0]);
        args[0] = "修改了"+args[0];
        Object proceed = point.proceed(args);
        System.out.println("方法执行后:"+(String) proceed);
        return proceed;

    }

}
