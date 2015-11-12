package org.observer;

// OBSERVER
public class Person implements TelephoneListener {
	
	public void observeTelephone(Telephone telephone) {
		telephone.setTelephoneListener(this);
	}

	public void TelephoneItTouched() {
		System.out.println("Eu atendooooo.....");
	}
}
