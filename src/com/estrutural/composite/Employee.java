package com.estrutural.composite;

public class Employee extends ElementsCompany {

	public Employee(String name) {
		super(name);
	}

	public void add(ElementsCompanyIF element) {
		System.out.println("Cannot add here");
	}

	public void remove(ElementsCompanyIF element) {
		System.out.println("Cannot remove here");
	}

	public void display(String ident) {
		System.out.println(ident + this);

	}

}
