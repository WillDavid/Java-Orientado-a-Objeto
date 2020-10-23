package charsGame;
import interfaceGame.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {

	public Cavaleiro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar() {
		System.out.println("O Cavaleiro "+this.getNome()+ " atacou com a espada");

	}

	@Override
	public void defender() {
		System.out.println("O Cavaleiro "+this.getNome()+ " se defendeu com o escudo");

	}

	@Override
	public void saltar() {
		System.out.println("O Cavaleiro "+this.getNome()+ " saltou");

	}
	
	@Override
	public void andar() {
		System.out.println("O Cavaleiro "+this.getNome()+ " andou");

	}

	@Override
	public void guardarItem() {
		System.out.println("O Cavaleiro "+this.getNome()+ " guardou a espada");

	}

	@Override
	public void usarItem() {
		System.out.println("O Cavaleiro "+this.getNome()+ " usou uma pocao");

	}
}
