// Autor: William David Martins de Almeida
// Link GitHub: https://github.com/WillDavid/Java-OO
public class Motorista extends Funcionario {
	
	private String CNH;
	
	public Motorista() {
		
	}

	public Motorista(String nome, String CNH) {
		super(nome);
		this.CNH = CNH;
	}
	
	
	public void imprimirDados() {
		System.out.println("\nNome funcionario: " + this.getNome()+"\nCNH: " + this.getCNH());
	}

	public String getCNH() {
		return CNH;
	}

	public void setCNH(String cNH) {
		CNH = cNH;
	}
	
	
	
	

}

	
