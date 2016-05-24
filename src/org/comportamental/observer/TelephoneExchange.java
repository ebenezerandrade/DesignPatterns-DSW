package org.comportamental.observer;

public class TelephoneExchange {

	public static void main(String args[]) {
		
		Telephone telephone = new Telephone();
		new Person(telephone);
		
		telephone.setState("Está tocando");
				
	}
}
