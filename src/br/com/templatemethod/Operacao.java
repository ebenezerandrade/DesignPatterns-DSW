package br.com.templatemethod;

public abstract class Operacao {

	public abstract String handleEfetuarOperacao(int valor1, int valor2);
	
	public void efetuarOperacao(int valor1, int valor2) {
		String resultado = handleEfetuarOperacao(valor1, valor2);
		System.out.println("O resultado da " + resultado);
	}
	
}
