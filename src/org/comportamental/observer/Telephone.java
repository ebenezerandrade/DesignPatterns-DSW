package org.comportamental.observer;

//concreteSubject
public class Telephone implements TelecommunicationEquipment{
	
	private TelephoneListener listener;
	private String telephoneState;

	public void attach(TelephoneListener listener) {
		this.listener = listener;
	}
	
	public void detach(TelephoneListener listener) {
		this.listener = listener;
	}
	
	public void isTouched() {
		listener.TelephoneItTouched();
	}

	public String getTelephoneState() {
		return telephoneState;
	}

	public void setTelephoneState(String telephoneState) {
		this.telephoneState = telephoneState;
	}
	
}
