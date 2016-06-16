package com.comportamental.templateMethod;

public class TreinoMeioDaTemporada extends Treino{
	
	//primitiveOperationConcrete1
	@Override
	public void jogoTreino() {
		System.out.println("Preparo Físico intenso.");
		
	}
	
	//primitiveOperationConcrete2
	@Override
	public void preparoFisico() {
		System.out.println("Treino com equipe reserva.");
	}
	
}
