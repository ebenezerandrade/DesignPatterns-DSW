package com.comportamental.templateMethod;

public class Test {
	
	public static void main(String[] args){
		Treino treino = new TreinoMeioDaTemporada();
		treino.treinoDiario();
		
		Treino treino2 = new TreinoInicioDaTemporada();
		treino2.treinoDiario();
	}
}
