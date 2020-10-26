// Autores: William David e Leticia Minelvino
// Link GitHub: https://github.com/WillDavid/Java-OO
package mainGame;

import java.util.ArrayList;

import Jogo.Jogo;
import charsGame.Cavaleiro;
import charsGame.Dragao;
import charsGame.Mago;
import charsGame.Personagem;

public class Principal {


	public static void main(String[] args) {
		
		
		
		ArrayList<Personagem> personagens = new ArrayList<Personagem>();
		
		Cavaleiro cav01 = new Cavaleiro("Will");
		Cavaleiro cav02 = new Cavaleiro("Diego");
		
		Dragao drag01 = new Dragao("Smaug");
		Dragao drag02 = new Dragao("Tiamat");
		
		Mago mag01 = new Mago("Merlin");
		Mago mag02 = new Mago("Gandalf");
		
		
		personagens.add(cav01);
		personagens.add(cav02);
		personagens.add(drag01);
		personagens.add(drag02);
		personagens.add(mag01);
		personagens.add(mag02);
		
		
		// Instancie um objeto da classe Jogo e submeta todos os personagens da lista ao método ControlarAçõesDosPersonagens();
		for (int i=0; i< personagens.size();i++) {
			Jogo jog01 = new Jogo(personagens.get(i));
			jog01.controlarPersonagem();
			
		}
		
		
		Personagem persona;
		
		persona = new Mago ("Saruman");
		((Mago) persona).invisibilidade();
			

	}

}
