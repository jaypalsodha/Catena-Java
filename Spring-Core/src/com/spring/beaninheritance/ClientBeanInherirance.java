package com.spring.beaninheritance;

import org.springframework.context.ApplicationContext;

import com.spring.util.SpringAppUtil;

public class ClientBeanInherirance {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringAppUtil.getApplicationContext();

		Shape shape = (Shape) applicationContext.getBean("shape");
		System.out.println(shape.getMessage1());
		System.out.println(shape.getMessage2());

		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		System.out.println(triangle.getMessage1());
		System.out.println(triangle.getMessage2());
		System.out.println(triangle.getMessage3());
	}
}
