package com.estrutural.facade;

public class Customer {
	
	public static void main(String[] args){
		Lawyer lawyer = new Lawyer();
		Process process = lawyer.getProcess(lawyer.CIVIL);
		
		System.out.println(process.getName());
	}
}
