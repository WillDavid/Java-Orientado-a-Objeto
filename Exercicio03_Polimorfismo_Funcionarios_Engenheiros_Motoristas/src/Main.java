// Autor: William David Martins de Almeida
// Link GitHub: https://github.com/WillDavid/Java-OO
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Motorista mot1 = new Motorista("Jorge", "56743554");
		Motorista mot2 = new Motorista("Romario", "56749999");
		
		
		Engenheiro eng1 = new Engenheiro("Fernando", "45643434");
		Engenheiro eng2 = new Engenheiro("Maria", "45343523");
		
		ArrayList<Funcionario> lista01 = new ArrayList<Funcionario>();
		
		
		lista01.add(eng1);
		lista01.add(eng2);
		lista01.add(mot2);
		lista01.add(mot1);
		
		
		for(int i=0; i< lista01.size();i++) {
			lista01.get(i).imprimirDados();
		}
		
		
	
	}

}
