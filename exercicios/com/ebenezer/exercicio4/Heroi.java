package com.ebenezer.exercicio4;

public class Heroi {
	
	private int dano;
	private boolean vida;
	
	private Item item;

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public boolean isVida() {
		return vida;
	}

	public void setVida(boolean vida) {
		this.vida = vida;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public void kitDeItem(Kit kit){
		System.out.println("Her�i carregado com o kit");
		
	}
}
