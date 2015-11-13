package br.com.templatemethod;

public class Subtracao extends Operacao {

	@Override
	public String handleEfetuarOperacao(int valor1, int valor2) {
		int resultado = valor1 - valor2;
		String string = "subtracao " + resultado;
		return string;
	}

}
