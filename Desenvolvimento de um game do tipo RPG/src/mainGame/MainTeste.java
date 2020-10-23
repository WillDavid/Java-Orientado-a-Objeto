package mainGame;
import Jogo.Jogo;
import charsGame.Cavaleiro;
import charsGame.Mago;

public class MainTeste {

	public static void main(String[] args) {
		
		
		Cavaleiro cav01 = new Cavaleiro("Jorge");
		cav01.atacar();
		cav01.andar();
		cav01.defender();
		Mago mag01 = new Mago("Roberto");
		mag01.andar();
		
		
		// Controlar Personagem
		Jogo controle01 = new Jogo(mag01);
		
		
		
		controle01.controlarPersonagem();
		
		
		controle01.setPerso(cav01);
		controle01.controlarPersonagem();
		
	
	
		
		
		
		
		
		

	}

}
