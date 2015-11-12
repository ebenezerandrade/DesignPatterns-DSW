package com.estrutural.facade;

public class CriminalJustice implements Justice {

	@Override
	public Process getProcess() {
		CriminalProcess process = new CriminalProcess();
		return process;
	}

}
