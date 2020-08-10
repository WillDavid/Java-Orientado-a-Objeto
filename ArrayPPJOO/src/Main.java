import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nome;
		int sorteado;
		
		Pessoa[] pessoas = new Pessoa[4];
		
		for(int i=0; i< pessoas.length; i++) {
			
			pessoas[i] = new Pessoa();
			
			nome = JOptionPane.showInputDialog("Informe o nome:");
			pessoas[i].setNome(nome);
			pessoas[i].setNumeroParaSorteio(i);
			
		}
		//Mostrar A lista de pessoas
		for(int j = 0; j< pessoas.length; j++) {
			System.out.println(pessoas[j].getNome());
		}
		// Sortear um numero
		sorteado = (int)(Math.random() * pessoas.length);
		
		
		for(int i=0; i<pessoas.length; i++) {
			if(pessoas[i].getNumeroParaSorteio() == sorteado) {
				JOptionPane.showMessageDialog(null, "A pessoa sorteada:" + pessoas[i].getNome());
			}
		}
		
		
		
		

	}

}
