package com.ebenezer.exercicio5;
public class Magico {
	
	public int danoMagia(Heroi heroi){
		int vidaAuxiliar;
		vidaAuxiliar = (heroi.getVida() - 20);
		heroi.setVida(vidaAuxiliar);
		
		return heroi.getVida();
	}
}
