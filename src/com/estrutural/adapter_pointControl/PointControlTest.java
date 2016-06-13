package com.estrutural.adapter_pointControl;

public class PointControlTest {
	
	public static void main(String[] args) throws InterruptedException {
		PointControl pointControl = new PointControl(1);
		Employee employee = new Employee("Omar Junior");
		pointControl.registerEntry(employee);
		pointControl.registerExit(employee);
	}
	
}
