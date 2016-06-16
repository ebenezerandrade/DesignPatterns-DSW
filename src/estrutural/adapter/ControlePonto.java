package estrutural.adapter;

public class ControlePonto {

	public void registrarEntrada(Funcionario funcionario) {
		System.out.println("Funcionario " + funcionario.getName() + " chegou!");
	}
	public void registrarSaida(Funcionario funcionario) {
		System.out.println("Funcionario " + funcionario.getName() + " foi embora!");
	}
}
