package comportamental.templateMethod;

public class TreinoTemporada extends Treino {

	@Override
	public void realizarTreinoFisico() {
		System.out.println("Em temporada, treino físico pesado!");
	}

	@Override
	public void realizarJogoTreino() {
		System.out.println("Em temporada, jogo treino pesado!");
	}

}
