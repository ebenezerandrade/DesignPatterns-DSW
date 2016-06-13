package com.estrutural.composite_kanban;

import java.util.Date;


//Leaf
public class Story extends Requisito {

	private Date dataAtualizacao;

	@Override
	public void atualizarHistorico(Date dataAtualizacao) {
		dataAtualizacao = this.dataAtualizacao;
		System.out.println("Story Atualizado");
	}
	
}