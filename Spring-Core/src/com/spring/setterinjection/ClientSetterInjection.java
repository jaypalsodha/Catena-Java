package com.spring.setterinjection;

import org.springframework.context.ApplicationContext;

import com.spring.util.SpringAppUtil;

public class ClientSetterInjection {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringAppUtil.getApplicationContextForSetter();
		TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
		textEditor.spellCheck();

	}
}
