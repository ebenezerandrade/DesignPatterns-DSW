package org.observer;

// ConcreteObserver
public class Person implements TelephoneListener {
	
	public void observeTelephone(Telephone telephone) {
		telephone.setTelephoneListener(this);
	}
	
	public void observeFax(Fax fax){
		fax.setTelephoneListener(this);
	}
	
	//update
	public void TelephoneItTouched() {
		System.out.println("Fora de linha");
	}
}
