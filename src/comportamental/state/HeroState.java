package comportamental.state;

public class HeroState implements State {

	@Override
	public void receberUncao(Personagem personagem) {
		System.out.println(this.getClass());
	}

	@Override
	public void perderUncao(Personagem personagem) {
		System.out.println("Heroi foi rebaixado para Guerreiro!");
	}

}
