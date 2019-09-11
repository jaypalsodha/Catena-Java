package com.spring.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;

import com.spring.util.SpringAppUtil;

public class ClientSpringLifecycle {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = (AbstractApplicationContext) SpringAppUtil
				.getApplicationContext();
		Exam objExam = (Exam) applicationContext.getBean("exam");
		applicationContext.registerShutdownHook();
	}
}
