package org.comportamental.observer;

import java.util.ArrayList;
import java.util.List;

//concreteSubject
public class Telephone implements TelecommunicationEquipment{
	
	private List<TelephoneListener> observers = new ArrayList<TelephoneListener>();
	private String telephoneState;

	public void attach(TelephoneListener observer) {
		observers.add(observer);
	}
	
	public void detach(TelephoneListener observer) {
		observers.add(observer);
	}

	public String getState() {
		return telephoneState;
	}

	public void setState(String telephoneState) {
		this.telephoneState = telephoneState;
		notifyAllObservers();
	}

	public void notifyAllObservers() {
		for(TelephoneListener observer : observers) {
			observer.update();
		}
	}
	
}
