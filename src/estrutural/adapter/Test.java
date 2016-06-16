package estrutural.adapter;

public class Test {

	public static void main(String []args) {
		Funcionario funcionario1 = new Funcionario("Benezi");
		Funcionario funcionario2 = new Funcionario("Marzin");
		ControlePonto controle = new ControlePonto();
		ControlePonto novoControle = new ControlePontoAdapter();
		
		controle.registrarEntrada(funcionario1);
		controle.registrarEntrada(funcionario2);
		
		controle.registrarSaida(funcionario1);
		controle.registrarSaida(funcionario2);
		
		novoControle.registrarEntrada(funcionario1);
		novoControle.registrarEntrada(funcionario2);
		
		novoControle.registrarSaida(funcionario1);
		novoControle.registrarSaida(funcionario2);
	}
}
