package com.ebenezer.exercicio3Revisao;

public class Test {

	public static void main(String[] args) {
		Personagem personagem = new Personagem();
		personagem.setNome("arngrim");
		
		
		System.out.println("Nome:"  +personagem.getNome());
		personagem.requisicaoGuerreiro();
		personagem.requisicaoHeroi();
	}

}
