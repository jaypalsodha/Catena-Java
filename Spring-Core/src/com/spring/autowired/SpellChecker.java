package com.spring.autowired;

public class SpellChecker {

	private SpellChecker() {
		System.out.println("spell checker object created.");
	}

	public void checkSpelling() {
		System.out.println("spell checking done");
	}
}
