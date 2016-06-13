package com.ebenezer.exercicio2;
public class test {
	
	public static void main(String[] args){
		Heroi heroi = new Heroi();
		DanoPuro danoPuro = new DanoPuro();
		DanoMagico danoMagico = new DanoMagico();
		DanoFisico danoFisico = new DanoFisico();
		heroi.setVida(100);
		System.out.println("Vida do heroi:" +heroi.getVida());
		danoPuro.dano(heroi);
		System.out.println("Vida do heroi:" +heroi.getVida());
		danoMagico.dano(heroi);
		System.out.println("Vida do heroi:" +heroi.getVida());
		danoFisico.dano(heroi);
		System.out.println("Vida do heroi:" +heroi.getVida());
	}
}
