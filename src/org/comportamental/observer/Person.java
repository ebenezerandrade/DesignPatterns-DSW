package org.comportamental.observer;

// ConcreteObserver
public class Person implements TelephoneListener {
	
	private String observeState;
	protected Telephone telephone;
	
	public Person(Telephone telephone) {
		this.telephone = telephone;
		this.telephone.attach(this);
	}
	
	public void update() {
		observeState = telephone.getState();
		System.out.println(observeState);
	}

}
