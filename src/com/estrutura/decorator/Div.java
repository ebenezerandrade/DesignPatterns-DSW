package com.estrutura.decorator;

public class Div extends ContainerDecorator {

	Component comp;
	
	public Div(Component comp) {
		this.comp = comp;
	}
	
	@Override
	public String getName() {
		return comp.getName() + " + DIV";
	}

	@Override
	public String getHtml() {
		String temp = "<div>";
		temp += comp.getHtml();
		return temp + "</div>";
	}

}
