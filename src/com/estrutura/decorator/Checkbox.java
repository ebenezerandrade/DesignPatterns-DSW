package com.estrutura.decorator;

public class Checkbox extends Component {

	public Checkbox() {
		name = "Checkbox";
	}
	
	@Override
	public String getHtml() {
		return "<input type='checkbox' name='checkbox1'>";
	}

}
