package org.comportamental.observer;

public interface TelecommunicationEquipment {

	public void attach(TelephoneListener listener);
	public void detach(TelephoneListener listener);
	public void isTouched();
}
