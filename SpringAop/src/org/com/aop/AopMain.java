package org.com.aop;

import org.com.aop.services.AopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AopService aopService = context.getBean("aopService", AopService.class);
		System.out.println(aopService.getCircle().getName());
		System.out.println(aopService.getTriangle().getName());
	}

}
