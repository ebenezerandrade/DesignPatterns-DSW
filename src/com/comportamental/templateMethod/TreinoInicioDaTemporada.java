package com.comportamental.templateMethod;

public class TreinoInicioDaTemporada extends Treino {

	@Override
	public void jogoTreino() {
		System.out.println("Preparo Físico leve.");
		
	}

	@Override
	public void preparoFisico() {
		System.out.println("Treino com equipe reserva.");
		
	}
	
	
}
