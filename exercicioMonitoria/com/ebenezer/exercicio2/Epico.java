package com.ebenezer.exercicio2;

import java.util.Date;

public class Epico extends Requisito {
	
	public void atualizarHistorico(Date date) {
		System.out.println("Ultima atualização épico" + date.toGMTString());
	}
	
}
