package com.ebenezer.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Kit extends Item{
	
	public List<Item> Itens = new ArrayList<Item>();
	
	public void adicionar(Item item){
		this.Itens.add(item);
	}
	
	public void remove(Item item){
		this.Itens.remove(item);
	}
	
	public void colocarItem(){
		System.out.println("kit carregado");
	}
}
