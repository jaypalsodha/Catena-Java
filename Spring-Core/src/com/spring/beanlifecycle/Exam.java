package com.spring.beanlifecycle;

public class Exam {

	private String name;

	public Exam() {
		System.out.println("I am just born");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init() {
		System.out.println("I am called from somewhere");
	}

	public void destroy() {
		System.out.println("I got destroyed.");
	}

}
