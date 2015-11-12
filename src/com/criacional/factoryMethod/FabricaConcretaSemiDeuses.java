package com.criacional.factoryMethod;

public class FabricaConcretaSemiDeuses extends AbstractFactory {

	@Override
	public BaseEstrutural Quartel() {
		return new SemiDeusesBaseEstrutural();
	}

	@Override
	public BaseEstrutural SedeFederacao() {
		return new SemiDeusesBaseEstrutural();
	}

	@Override
	public BaseEstrutural SalaGuerra() {
		return new SemiDeusesBaseEstrutural();
	}

	
	public UnidadeBatalha Unidade(){
		return new SemiDeusesUnidadeBatalha();
	}

}
