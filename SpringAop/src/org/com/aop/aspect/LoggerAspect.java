package org.com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	
	@Before("allGetters()")
	public void logAdvice(){
		System.out.println("Advice here !!! Method is called from Aop");
	}
	
	@Pointcut ("execution (* get*(..))")
	public void allGetters(){}
}
