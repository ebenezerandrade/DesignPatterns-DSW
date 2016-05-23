package org.observer;

public class TelephoneExchange {

	public static void main(String args[]) {
		
		Telephone telephone1 = new Telephone();
		Person fulano = new Person();
		
		fulano.observeTelephone(telephone1);
		
		telephone1.isTouched();
	}
}
