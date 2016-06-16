package estrutural.adapter;

public class NovoControlePonto {
	
	public void registrarEntradaOuSaida(Funcionario funcionario, boolean status) {
		if(status == true) {
			System.out.println("Novo Ponto - Funcionario " + funcionario.getName() + " chegou!");
		}
		else {
			System.out.println("Novo Ponto - Funcionario " + funcionario.getName() + " foi embora!");
		}
	}
}
