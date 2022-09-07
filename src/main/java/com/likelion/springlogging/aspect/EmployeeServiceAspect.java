package com.likelion.springlogging.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class EmployeeServiceAspect {
    private Logger logger = LoggerFactory.getLogger(EmployeeServiceAspect.class);

    @AfterThrowing("execution(* com.likelion.springlogging.service.Imp.EmployeeServiceImp.getEmployeeDto(..))")
    public void Error(JoinPoint joinPoint){
        logger.error("After error method: " + joinPoint.toString());
    }
}
