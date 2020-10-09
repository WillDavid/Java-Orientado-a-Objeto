package mainGame;
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
		
		
		
		
		

	}

}
