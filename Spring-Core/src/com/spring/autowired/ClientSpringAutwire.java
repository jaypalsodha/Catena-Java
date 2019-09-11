package com.spring.autowired;

import org.springframework.context.ApplicationContext;

import com.spring.util.SpringAppUtil;

public class ClientSpringAutwire {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringAppUtil.getApplicationContextForAutoWired();
		TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
		textEditor.spellCheck();
	}
}
