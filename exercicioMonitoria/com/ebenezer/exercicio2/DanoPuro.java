package com.ebenezer.exercicio2;
import Heroi;

public class DanoPuro {

	//private Heroi heroi;
	
	public int dano(Heroi heroi){
		
		int vidaAuxiliar;
		vidaAuxiliar = (heroi.getVida() - 10);
		heroi.setVida(vidaAuxiliar);
		
		return heroi.getVida(); 
	}
}
