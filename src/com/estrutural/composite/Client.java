package com.estrutural.composite;

public class Client {

	public static void main(String[] args) {
		
		CompositeElementsCompany empresa = new CompositeElementsCompany("Empresa X");
		
		CompositeElementsCompany departA = new CompositeElementsCompany("Departamento A");
		CompositeElementsCompany departB = new CompositeElementsCompany("Departamento B");
				
		empresa.add(departA);
		empresa.add(departB);
		
		departA.add(new Employee("Omar"));
		departA.add(new Employee("Ebenezer"));
		
		departB.add(new Employee("Matheus"));
		departB.add(new Employee("Italo"));
		departB.add(new Employee("Emilie"));
		
		empresa.display("-");

	}

}
