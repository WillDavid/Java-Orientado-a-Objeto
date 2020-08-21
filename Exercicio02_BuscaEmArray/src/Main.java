// Author: William David Martins de Almeida
// Date: 21.08.2020
// Link repository: https://github.com/WillDavid/Java-OO

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		Pessoa listaPessoas[] = new Pessoa[3];
		String name;
		boolean estaNaLista = false;
		
		
		for(int i=0; i< listaPessoas.length;i++) {
			name = JOptionPane.showInputDialog("Nome da pessoa: ");
			
			listaPessoas[i] = new Pessoa(name);
			
			System.out.println(listaPessoas[i].getName());
		}
		
		String nameProcurando = JOptionPane.showInputDialog("Qual pessoa você está procurando?\nEscreva no campo abaixo");
		
		for(int j=0;j<listaPessoas.length;j++) {
			if(listaPessoas[j].getName().contains(nameProcurando)) {
				JOptionPane.showMessageDialog (null, "A Pessoa: "+listaPessoas[j].getName()+ " esta na lista");
				estaNaLista = true;
			}
		}
		
		if(estaNaLista == false) {
			JOptionPane.showMessageDialog(null, "O nome não está na lista");
		}

	}

}
