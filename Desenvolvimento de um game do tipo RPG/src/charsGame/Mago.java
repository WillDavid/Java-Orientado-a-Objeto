package charsGame;
import interfaceGame.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico {

	public Mago(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void invisibilidade() {
		System.out.println("O Mago "+this.getNome()+ " esta invisivel");

	}

	@Override
	public void ultraRapidez() {
		System.out.println("O Mago "+this.getNome()+ " esta ultra Rapido");

	}
	
	@Override
	public void andar() {
		System.out.println("O Mago "+this.getNome()+ " andou");

	}

	@Override
	public void guardarItem() {
		System.out.println("O Mago "+this.getNome()+ " guardou a varinha");

	}

	@Override
	public void usarItem() {
		System.out.println("O Mago "+this.getNome()+ " usou uma pocao");

	}

}
