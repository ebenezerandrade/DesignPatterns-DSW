package org.comportamental.observer;

public class Fax implements TelecommunicationEquipment {
	
	private TelephoneListener listener;
	
	private String faxState;	

	public void attach(TelephoneListener listener) {
		this.listener = listener;
	}
	
	public void detach(TelephoneListener listener) {
		this.listener = listener;
	}
	
	public void isTouched() {
		listener.TelephoneItTouched();
	}

	public String getFaxState() {
		return faxState;
	}

	public void setFaxState(String faxState) {
		this.faxState = faxState;
	}
	

}
