package com.criacional.factoryMethod;

public class Client {
	
	public static void main(String[] args){
		
		AbstractFactory abf = new FabricaConcretaGaea();
		
		BaseEstrutural quartel1 = abf.Quartel();
		quartel1.QuartelGeneral();
		
		BaseEstrutural sede1 = abf.SedeFederacao();
		sede1.Sede();
		
		BaseEstrutural batalha = abf.SalaGuerra();
		batalha.SalaDeCombate();
		
		UnidadeBatalha batalhaUnidade = abf.Unidade();
		batalhaUnidade.UnidadeCombate();
	}
}
