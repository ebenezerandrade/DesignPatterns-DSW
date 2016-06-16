package comportamental.templateMethod;

public class Test {

	public static void main(String []args) {
		Treino treinoFerias = new TreinoFerias();
		treinoFerias.realizarTreinoDiario();
		System.out.println("\n");
		Treino treinoTemporada = new TreinoTemporada();
		treinoTemporada.realizarTreinoDiario();
	}
}
