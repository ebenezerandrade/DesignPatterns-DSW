package com.estrutural.composite_kanban;

//Leaf
public abstract class Requisito implements Artefato{
	
	protected String idRequisito;
	protected String descricao;

	public String getIdRequisito() {
		return idRequisito;
	}

	public void setIdRequisito(String idRequisito) {
		this.idRequisito = idRequisito;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
