package br.com.decorator;

public class Button extends Component {

	public Button() {
		name = "Button";
	}
	
	@Override
	public String getHtml() {
		return "<input type='button' value='Clique aqui'>";
	}

}
