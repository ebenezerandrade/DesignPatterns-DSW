package com.ebenezer.exercicio2;

import java.util.Date;

//folha
public abstract class Requisito implements Artefato{
	
	private String id;
	private String descricao;
	private Date data;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
