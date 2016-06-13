package com.estrutura.decorator;

public abstract class Component {

	protected String name;
	
	public String getName() {
		return name;
	}
	
	public abstract String getHtml();

}
