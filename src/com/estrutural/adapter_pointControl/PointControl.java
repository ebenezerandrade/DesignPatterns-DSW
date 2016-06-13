package com.estrutural.adapter_pointControl;

public class PointControl {
	
	private int blabla;
	
	public PointControl(int blabla) {
		this.blabla = blabla;
	}
	
	public void registerEntry(Employee employee) {
		System.out.println("Entrada: " + employee.getName());
	}
	
	public void registerExit(Employee employee) {
		System.out.println("Saída: " + employee.getName());
	}
}
