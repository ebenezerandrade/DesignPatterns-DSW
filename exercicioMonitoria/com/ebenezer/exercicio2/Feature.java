package com.ebenezer.exercicio2;

import java.util.Date;

public class Feature extends Requisito{
	
	@Override
	public void atualizarHistorico(Date date) {
		
		System.out.println("Ultima atualização feature " + date.toGMTString());
	}
}
