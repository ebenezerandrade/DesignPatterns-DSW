package estrutural.adapter;

public class ControlePontoAdapter extends ControlePonto {

	NovoControlePonto novoControle = new NovoControlePonto();
	
	public void registrarEntrada(Funcionario funcionario) {
		novoControle.registrarEntradaOuSaida(funcionario, true);
	}
	public void registrarSaida(Funcionario funcionario) {
		novoControle.registrarEntradaOuSaida(funcionario, true);
	}
}
