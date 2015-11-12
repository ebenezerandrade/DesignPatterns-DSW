package com.criacional.factoryMethod;

public class FabricaConcretaGaea extends AbstractFactory {

	@Override
	public BaseEstrutural Quartel() {
		return new GaeaBaseEstrutural();
	}

	@Override
	public BaseEstrutural SedeFederacao() {
		return new GaeaBaseEstrutural();
	}

	@Override
	public BaseEstrutural SalaGuerra() {
		return new GaeaBaseEstrutural();
	}

	
	public UnidadeBatalha Unidade(){
		return new GaeaUnidadeBatalha();
	}

}
