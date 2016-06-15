package comportamental.state;

public class Test {

	public static void main(String[] args) {

		Personagem personagem = new Personagem();
		personagem.setName("Cacaroto");
		
		System.out.println("Nome: " + personagem.getName());
		personagem.receberUncao(personagem);
		personagem.perderUncao(personagem);
	}

}
