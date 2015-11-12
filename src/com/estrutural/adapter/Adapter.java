package com.estrutural.adapter;

public class Adapter extends MathLib implements Calculator {

	@Override
	public double complexCaculation(double x) {
		double y = squareRoot(x) -1;
		return sum(y, x*2);
	}

}
