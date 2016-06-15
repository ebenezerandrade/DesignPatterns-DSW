package comportamental.state;

public class WarriorState implements State {

	@Override
	public void receberUncao(Personagem personagem) {
		System.out.println("Guerreiro foi evoluído para Heroi!");
	}

	@Override
	public void perderUncao(Personagem personagem) {
		// nothing to do
	}

}
