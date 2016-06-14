package com.estrutural.composite_kanban;

import java.util.Date;

//Client
public class Cliente {

	public static void main(String[] args) {

		Epico ep1 = new Epico();
		Feature f1 = new Feature();
		Story s1 = new Story();
		Kanban k1 = new Kanban();
		Date date = new Date();

		ep1.setDescricao("ep01");
		f1.setDescricao("f01");
		s1.setDescricao("s01");
		
		ep1.atualizarHistorico(date);
		f1.atualizarHistorico(date);
		s1.atualizarHistorico(date);
		
		k1.imprimirListaRequisitos();
		
		k1.addRequisito(ep1);
		k1.addRequisito(f1);
		k1.addRequisito(s1);
		
		k1.imprimirListaRequisitos();
		
		k1.removeRequisito(ep1);
		k1.removeRequisito(f1);
		k1.removeRequisito(s1);
		
		k1.imprimirListaRequisitos();
	}

}
