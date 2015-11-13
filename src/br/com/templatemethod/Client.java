package br.com.templatemethod;

public class Client {

	public static void main(String[] args) {
		
		Operacao operacao1 = new Soma();
		Operacao operacao2 = new Subtracao();
		Operacao operacao3 = new Multiplicacao();
		Operacao operacao4 = new Divisao();
		
		operacao1.efetuarOperacao(9, 3);
		operacao2.efetuarOperacao(9, 3);
		operacao3.efetuarOperacao(9, 3);
		operacao4.efetuarOperacao(9, 3);
	}

}
