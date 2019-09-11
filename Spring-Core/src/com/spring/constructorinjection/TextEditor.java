package com.spring.constructorinjection;

public class TextEditor {

	private SpellChecker spellChecker;

	private TextEditor(SpellChecker spellChecker) {
		System.out.println("text editor object created. ");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
