package com.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppUtil {
	public static ApplicationContext getApplicationContext() {
		return new ClassPathXmlApplicationContext("spring-config.xml");
	}

	public static ApplicationContext getApplicationContextForSetter() {
		return new ClassPathXmlApplicationContext("spring-config-setter.xml");
	}

	private SpringAppUtil() {

	}

	public static ApplicationContext getApplicationContextForConstructor() {
		return new ClassPathXmlApplicationContext("spring-config-constructor.xml");
	}

	public static ApplicationContext getApplicationContextForAutoWired() {
		return new ClassPathXmlApplicationContext("spring-config-autowire.xml");
	}
}
