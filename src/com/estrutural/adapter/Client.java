package com.estrutural.adapter;

public class Client {

	public static void main(String[] args){
		Calculator calculator = new Adapter();
		System.out.println(calculator.complexCaculation(10));
	}
}
