package com.example.demo.loggingAspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LoggingAspectBefore {






    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.example.demo.service.ProductServiceimpl.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint) {
        LOGGER.info("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
    }

    @Before("execution(* com.example.demo.service.ProductServiceimpl.addProduct(..))")
    public void logBeforeGetProduct(JoinPoint joinPoint) {
        LOGGER.info("****LoggingAspect.logBeforeGetProduct() : " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.example.demo.service.ProductServiceimpl.addProduct(..))")
    public void logAfterAddProduct(JoinPoint joinPoint) {
        LOGGER.info("****This is added after execution() : " + joinPoint.getSignature().getName());
    }
}
