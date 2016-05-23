package org.observer;

// SOURCE
public class Telephone {

	private TelephoneListener listener;
	
	public void setTelephoneListener(TelephoneListener listener) {
		
		this.listener = listener;
	}
	
	public void isTouched() {
		
		listener.TelephoneItTouched();
	}
	
}
