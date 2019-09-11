package com.spring.constructorinjection;

import org.springframework.context.ApplicationContext;

import com.spring.util.SpringAppUtil;

public class ClientConstrutorIjection {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringAppUtil.getApplicationContextForConstructor();

		TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
		textEditor.spellCheck();

	}
}
