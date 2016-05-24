package org.comportamental.observer;

public class TelephoneExchange {

	public static void main(String args[]) {
		
		Telephone telephone = new Telephone();
		Person fulano = new Person("Omarzin");
		
		fulano.observeTelephoneState(telephone);
		telephone.isTouched();
		
		Fax fax = new Fax();
		Person outroFulano = new Person("Benézi");
		
		outroFulano.observeFaxState(fax);
		fax.isTouched();
	}
}
