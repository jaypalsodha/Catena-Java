package com.spring.beanscope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientBeanScope {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		Object bean = applicationContext.getBean("student");

		Student student = (Student) bean;
		student.setName("testing singleton scope");

		Student singletonStudent = (Student) applicationContext.getBean("student");
		System.out.println(singletonStudent.show());

		applicationContext.close();
	}
}
