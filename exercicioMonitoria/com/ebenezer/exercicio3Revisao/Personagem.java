package com.ebenezer.exercicio3Revisao;

public class Personagem {
	
	private String nome;
	private State state;
	
	//Request
	public void requisicaoHeroi(){
		//State.handle
		this.state = new Heroi();
		state.uncao(this);
	}
	//Resquest
	public void requisicaoGuerreiro(){
		//state.handle
		this.state = new Guerreiro();
		state.uncao(this);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public State getState() {
		return state;
	}
}
