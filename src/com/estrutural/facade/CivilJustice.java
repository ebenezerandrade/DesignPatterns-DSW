package com.estrutural.facade;

public class CivilJustice implements Justice {

	@Override
	public Process getProcess() {
		CivilProcess process = new CivilProcess();
		return process;
	}

}
