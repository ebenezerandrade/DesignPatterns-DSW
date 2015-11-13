package com.criacional.AbstractMethod;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new Siena();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Palio();
	}

	@Override
	public CarroSUV criarCarroSUV() {
		return new Freemont();
	}

}
