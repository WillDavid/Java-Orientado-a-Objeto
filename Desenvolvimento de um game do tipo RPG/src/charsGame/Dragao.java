package charsGame;
import interfaceGame.ComportamentoFeroz;

public class Dragao extends Personagem implements ComportamentoFeroz {

	public Dragao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atirarFogo() {
		System.out.println("O Dragão "+this.getNome()+ " está mordendo");

	}

	@Override
	public void voar() {
		System.out.println("O Dragão "+this.getNome()+ " está voando");

	}

	@Override
	public void morder() {
		System.out.println("O Dragão "+this.getNome()+ " mordeu");

	}
	
	@Override
	public void andar() {
		System.out.println("O Dragão "+this.getNome()+ " andou");

	}

	@Override
	public void guardarItem() {
		System.out.println("O Dragão "+this.getNome()+ " guardou o seu ouro");

	}

	@Override
	public void usarItem() {
		System.out.println("O Dragão "+this.getNome()+ " usou uma poção");

	}

}
