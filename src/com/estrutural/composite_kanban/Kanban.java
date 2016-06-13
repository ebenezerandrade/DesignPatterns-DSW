package com.estrutural.composite_kanban;

import java.util.List;
import java.util.ArrayList;

//Composite
public class Kanban {

	private List<Requisito> listaRequisito = new ArrayList<Requisito>();
	
	public List<Requisito> addRequisito(Requisito requisito) {
		this.listaRequisito.add(requisito);
		System.out.println(requisito.getDescricao() + " adicionado!");
		return listaRequisito;
	}
	
	public List<Requisito> removeRequisito(Requisito requisito) {
		listaRequisito.remove(requisito);
		System.out.println(requisito.getDescricao() + " removido!");
		return listaRequisito;
	}
}
