// Autores: William David e Leticia Minelvino
// Link GitHub: https://github.com/WillDavid/Java-OO

package charsGame;
import interfaceGame.ComportamentoNormal;

public class Personagem implements ComportamentoNormal {
	private String nome;
	
	public Personagem(String nome) {
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	@Override
	public void andar() {
		

	}

	@Override
	public void guardarItem() {
		// TODO Auto-generated method stub

	}

	@Override
	public void usarItem() {
		// TODO Auto-generated method stub

	}

}
