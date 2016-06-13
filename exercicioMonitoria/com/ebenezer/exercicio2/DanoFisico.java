package com.ebenezer.exercicio2;
import DanoPuro;
import Fisico;
import Heroi;

public class DanoFisico extends DanoPuro{
	
	private Fisico fisico;
	
	public int dano(Heroi heroi){ 
		this.fisico = new Fisico();
		return fisico.danoFisico(heroi);
	}
}
