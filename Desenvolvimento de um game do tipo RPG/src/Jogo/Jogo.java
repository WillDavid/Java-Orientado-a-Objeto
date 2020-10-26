// Autores: William David e Leticia Minelvino
// Link GitHub: https://github.com/WillDavid/Java-OO
package Jogo;
import charsGame.Personagem;

public class Jogo {
	private Personagem perso;
	
	
	public Jogo(Personagem perso) {
		this.perso = perso;
	}

	
	
	public void controlarPersonagem() {
		perso.andar();
		perso.guardarItem();
		perso.usarItem();
		System.out.println("\n");
	}



	public Personagem getPerso() {
		return perso;
	}



	public void setPerso(Personagem perso) {
		this.perso = perso;
	}
	
	
}
