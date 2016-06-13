package com.ebenezer.exercicio2;

public class DanoFisico extends DanoPuro{
	
	private Fisico fisico;
	
	public int dano(Heroi heroi){ 
		this.fisico = new Fisico();
		return fisico.danoFisico(heroi);
	}
}
