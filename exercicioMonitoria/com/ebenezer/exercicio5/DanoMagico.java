package com.ebenezer.exercicio5;

public class DanoMagico extends DanoPuro{
	
	private Magico magico;
	
	public int dano(Heroi heroi){ 
		this.magico = new Magico();
		return magico.danoMagia(heroi);
	}
}
