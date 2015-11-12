package com.estrutural.facade;
//Facade
public class Lawyer {
	
	public static final int CRIMINAL = 0;
	public static final int CIVIL = 1;
	
	public Process getProcess(int type){
		
		switch (type){
		
		case CRIMINAL:
			Justice criminalCriminal = new CriminalJustice();
			return criminalCriminal.getProcess();
		case CIVIL:
			Justice civilCriminal = new CivilJustice();
			return civilCriminal.getProcess();
		default: 
			return null;
		}
	}
	
}
