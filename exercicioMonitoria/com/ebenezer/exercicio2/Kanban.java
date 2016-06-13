package com.ebenezer.exercicio2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Composite
public class Kanban {
	
	public List<Artefato> artefatos = new ArrayList<Artefato>();
	
	public void adicionarArtefato(Artefato artefato){
		System.out.println("Artefato adicionado");
		this.artefatos.add(artefato);
	}
	
	public void removerArtefato(Artefato artefato){
		System.out.println("Artefato removido");
		this.artefatos.remove(artefato);
	}
	
	public List<Artefato> getArtefatos() {
		return artefatos;
	}

	public void setArtefatos(List<Artefato> artefatos) {
		this.artefatos = artefatos;
	}

	public void atualizarHistorico(Date date){
		System.out.println("Histórico atualizado");
	}
	
	public void imprimirLista(List<Artefato> lista){
		for(int i=0 ; i < lista.size() ; i++){
			System.out.println(lista.get(i));
		}
	}
	
}
