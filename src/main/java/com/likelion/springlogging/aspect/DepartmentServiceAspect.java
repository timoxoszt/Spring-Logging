package com.likelion.springlogging.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class DepartmentServiceAspect {
    private Logger logger = LoggerFactory.getLogger(DepartmentServiceAspect.class);

    @Before("execution(* com.likelion.springlogging.service.Imp.DepartmentServiceImp.getDepartmentDto(..))")
    public void Before(JoinPoint joinPoint){
        logger.info("Before call method: " + joinPoint.toString());
    }

    @After("execution(* com.likelion.springlogging.service.Imp.DepartmentServiceImp.getDepartmentDto(..))")
    public void After(JoinPoint joinPoint){
        logger.info("After called method: "+ joinPoint.toString());
    }
}
