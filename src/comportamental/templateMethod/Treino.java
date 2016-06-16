package comportamental.templateMethod;

public abstract class Treino {

	public final void realizarTreinoDiario() {
		realizarTreinoFisico();
		realizarJogoTreino();
	}
	
	public abstract void realizarTreinoFisico();
	public abstract void realizarJogoTreino();
}
