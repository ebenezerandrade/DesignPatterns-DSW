package org.observer;

//concreteSubject
public class Telephone implements TelecommunicationsEquipment{
	
	private TelephoneListener listener;

	public void setTelephoneListener(TelephoneListener listener) {
		this.listener = listener;
	}
	
	public void isTouched() {
		
		listener.TelephoneItTouched();
	}
	
}
