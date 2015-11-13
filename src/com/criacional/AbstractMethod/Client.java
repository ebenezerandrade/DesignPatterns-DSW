package com.criacional.AbstractMethod;

public class Client {
	
	public static void main(String[] args){
		
		FabricaDeCarro fabricaFiat = new FabricaFiat();
		CarroSedan carroSedanFiat = fabricaFiat.criarCarroSedan();
		carroSedanFiat.exibirInfoSedan();
		
		FabricaDeCarro fabricaFord = new FabricaFord();
		CarroPopular carroSedanFord = fabricaFord.criarCarroPopular();
		carroSedanFord.exibirInfoPopular();
		
		FabricaDeCarro fabrica = new FabricaFiat();
		CarroSUV carroSUVFiat = fabrica.criarCarroSUV();
		carroSUVFiat.exibirInfoSUV();
	}
}
