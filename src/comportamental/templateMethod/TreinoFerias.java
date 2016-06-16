package comportamental.templateMethod;

public class TreinoFerias extends Treino {

	@Override
	public void realizarTreinoFisico() {
		System.out.println("Em férias, treino físico leve!");
	}
	
	@Override
	public void realizarJogoTreino() {
		System.out.println("Em férias, jogo treino leve!");
	}
}
