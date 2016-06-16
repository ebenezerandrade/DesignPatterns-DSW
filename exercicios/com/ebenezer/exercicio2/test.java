package com.ebenezer.exercicio2;

import java.util.Date;

public class test {
	
	public static void main(String[] args){
		
		Kanban k1 = new Kanban();
		Epico ep1 = new Epico();
		Feature f1 = new Feature();
		Story st1 = new Story();
		Date date = new Date();
		
		ep1.atualizarHistorico(date);
		f1.atualizarHistorico(date);
		st1.atualizarHistorico(date);
		
		k1.adicionarArtefato(ep1);
		k1.adicionarArtefato(f1);
		k1.adicionarArtefato(st1);
		k1.removerArtefato(f1);
		
		k1.imprimirLista(k1.getArtefatos());
	}
}
