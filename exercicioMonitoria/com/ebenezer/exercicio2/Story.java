package com.ebenezer.exercicio2;

import java.util.Date;

public class Story extends Requisito{

	public void atualizarHistorico(Date date) {
		System.out.println("Ultima atualização story " + date.toGMTString());
	}
}
