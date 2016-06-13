package com.ebenezer.exercicio4;

public class test {
	
	public static void main(String[] args){
		Item item = new Arma();
		Item item2 = new Armadura();
		Item item3 = new Joia();
		
		Kit kit1 = new Kit();
		kit1.adicionar(item);
		item.colocarItem();
		kit1.adicionar(item2);
		item2.colocarItem();
		kit1.adicionar(item3);
		item3.colocarItem();
		
		Heroi arquiles = new Heroi();
		arquiles.kitDeItem(kit1);
	}
}
