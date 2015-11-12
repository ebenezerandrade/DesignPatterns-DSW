package com.criacional.factoryMethod;

public abstract class AbstractFactory {
	
	/* Criação dos métodos abstratos que serão trazidas
	 * pela nossa abstração BaseEstrutural, que é a nossa
	 * classe de produtos abstratos.
	*/

	public abstract BaseEstrutural Quartel();
	
	public abstract BaseEstrutural SedeFederacao();
	
	public abstract BaseEstrutural SalaGuerra();
	
	public abstract UnidadeBatalha Unidade();
}
