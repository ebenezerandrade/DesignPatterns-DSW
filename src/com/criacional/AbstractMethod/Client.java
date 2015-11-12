package com.criacional.AbstractMethod;

public class Client {
	
	public static void main(String[] args){
		
		FabricaDeCarro fabrica = new FabricaFiat();
		CarroSedan carroTest = fabrica.criarCarroSedan();
		carroTest.exibirInfoSedan();
	}
}
