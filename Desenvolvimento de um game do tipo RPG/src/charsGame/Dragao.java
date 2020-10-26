// Autores: William David e Leticia Minelvino
// Link GitHub: https://github.com/WillDavid/Java-OO

package charsGame;
import interfaceGame.ComportamentoFeroz;

public class Dragao extends Personagem implements ComportamentoFeroz {

	public Dragao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atirarFogo() {
		System.out.println("O Dragao "+this.getNome()+ " esta mordendo");

	}

	@Override
	public void voar() {
		System.out.println("O Dragao "+this.getNome()+ " esta voando");

	}

	@Override
	public void morder() {
		System.out.println("O Dragao "+this.getNome()+ " mordeu");

	}
	
	@Override
	public void andar() {
		System.out.println("O Dragao "+this.getNome()+ " andou");

	}

	@Override
	public void guardarItem() {
		System.out.println("O Dragao "+this.getNome()+ " guardou o seu ouro");

	}

	@Override
	public void usarItem() {
		System.out.println("O Dragao "+this.getNome()+ " usou uma pocao");

	}

}
