package com.estrutura.decorator;

public class HtmlGen {

	public static void main(String[] args) {

		Component checkbox = new Checkbox();
		ContainerDecorator container = new Fieldset(new Div(checkbox));
		System.out.println(container.getName());
		
	}

}
