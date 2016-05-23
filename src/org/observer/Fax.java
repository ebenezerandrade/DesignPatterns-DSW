package org.observer;

public class Fax implements TelecommunicationsEquipment {
	
	private TelephoneListener listener;

	public void setTelephoneListener(TelephoneListener listener){
		this.listener = listener;
	}
	
	public void isTouched() {
		listener.TelephoneItTouched();
	}
}
