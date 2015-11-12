package com.estrutural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeElementsCompany extends ElementsCompany {

	private List<ElementsCompanyIF> elements = new ArrayList<ElementsCompanyIF>();
	
	public CompositeElementsCompany(String name) {
		super(name);
	}
	
	@Override
	public void add(ElementsCompanyIF element) {
		elements.add(element);
	}

	@Override
	public void remove(ElementsCompanyIF element) {
		elements.remove(element);
	}

	@Override
	public void display(String ident) {
		System.out.println(ident + this);
		ident += "-";
		for(ElementsCompanyIF element : elements) {
			element.display(ident);
		}
	}

}
