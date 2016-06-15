package com.ebenezer.exercicio2Revisao;

public class AdaptaControleFuncionario extends ControleFuncionario{
	
	public void entrada(Funcionario funcionario){
		NovoControleFuncionario controleFuncionario = new NovoControleFuncionario();
		controleFuncionario.novaEntrada(funcionario);
	}
	
	public void saida(Funcionario funcionario){
		NovoControleFuncionario controleFuncionario = new NovoControleFuncionario();
		controleFuncionario.novaSaida(funcionario);
	}
}
