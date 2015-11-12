package com.estrutural.composite;

public abstract class ElementsCompany implements ElementsCompanyIF {

	private String name;
	
	public ElementsCompany(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

}
