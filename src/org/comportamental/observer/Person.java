package org.comportamental.observer;

// ConcreteObserver
public class Person implements TelephoneListener {
	
	private String name;
	private String observeState;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void observeTelephoneState(Telephone telephone) {
		
	}
	
	public void observeFaxState(Fax fax) {
		
	}
	
	public void update(TelecommunicationEquipment obj) {
		
	}
	
	//update
	public void TelephoneItTouched() {
		System.out.println("Eu, " + name + ", atendo!");
	}
}
