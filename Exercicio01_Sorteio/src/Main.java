// Author: William David Martins de Almeida
// Date: 21.08.2020
// Link repository: https://github.com/WillDavid/Java-OO

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		String nameInput;
		Pessoa pessoa[] = new Pessoa[10];
		
		for(int i = 0; i<pessoa.length; i++) {
			nameInput = JOptionPane.showInputDialog("Informe o nome da pessoa");
			pessoa[i] = new Pessoa(nameInput, i);
		}
		
		
		
		int sorteio = (int)(Math.random()*10+1);
		
		
		
		
		for(int j=0; j<pessoa.length;j++) {
			if(sorteio == pessoa[j].getNumber()) {
				JOptionPane.showMessageDialog (null, "O vencedor é: "+pessoa[j].getName());
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}




