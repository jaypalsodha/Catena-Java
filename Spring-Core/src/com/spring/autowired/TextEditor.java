package com.spring.autowired;

public class TextEditor {

	private SpellChecker spellChecker;

	private TextEditor() {
		System.out.println("text editor object created. ");
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
