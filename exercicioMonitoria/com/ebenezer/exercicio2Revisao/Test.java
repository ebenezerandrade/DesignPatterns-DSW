package com.ebenezer.exercicio2Revisao;

public class Test {
	
	public static void main(String[] args){
		Funcionario funcionario = new Funcionario();
		AdaptaControleFuncionario controleFuncionario = new AdaptaControleFuncionario();
		
		controleFuncionario.entrada(funcionario);
		controleFuncionario.saida(funcionario);
	}
}
