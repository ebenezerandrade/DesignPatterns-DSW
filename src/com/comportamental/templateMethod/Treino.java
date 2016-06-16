/*
 * Exemplo do DevMedia
 * http://www.devmedia.com.br/padrao-de-projeto-template-method-em-java/26656
 * 
 */

package com.comportamental.templateMethod;

//AbstractClass
public abstract class Treino {
	
	//TemplateMethod
	public final void treinoDiario(){
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	public final void treinoTatico(){
		System.out.println("Treino Tatico");
	}
	
	//primitiveOperation1
	public abstract void jogoTreino();
	
	//PrimitiveOperation2 
	public abstract void preparoFisico();
}
