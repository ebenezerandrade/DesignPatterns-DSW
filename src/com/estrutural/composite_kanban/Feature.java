package com.estrutural.composite_kanban;

import java.util.Date;

//Leaf
public class Feature extends Requisito {

	private Date dataAtualizacao;

	@Override
	public void atualizarHistorico(Date dataAtualizacao) {
		dataAtualizacao = this.dataAtualizacao;
		System.out.println("Feature Atualizado");
	}
	
}