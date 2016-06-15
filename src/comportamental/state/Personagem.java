package comportamental.state;

public class Personagem {

	private String name;
	private State state;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void receberUncao(Personagem personagem) {
		this.state = new WarriorState();
		state.receberUncao(this);
	}
	
	public void perderUncao(Personagem personagem) {
		this.state = new HeroState();
		state.perderUncao(this);
	}

}
