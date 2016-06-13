package com.estrutura.decorator;

public class Fieldset extends ContainerDecorator {

	Component comp;
	
	public Fieldset(Component comp) {
		this.comp = comp;
	}
	
	@Override
	public String getName() {
		return comp.getName() + " + FIELDSET";
	}

	@Override
	public String getHtml() {
		String temp = "<fieldset>";
		temp += "<legend> Título <legend>";
		temp += comp.getHtml();
		return temp + "</fieldset>";
	}

}
