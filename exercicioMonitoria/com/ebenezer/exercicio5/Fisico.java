package com.ebenezer.exercicio5;

public class Fisico {

	public int danoFisico(Heroi heroi){
		int vidaAuxiliar;
		vidaAuxiliar = (heroi.getVida() - 30);
		heroi.setVida(vidaAuxiliar);
		
		return heroi.getVida();
	}
}
