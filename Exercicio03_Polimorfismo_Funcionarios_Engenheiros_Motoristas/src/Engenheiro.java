// Autor: William David Martins de Almeida
// Link GitHub: https://github.com/WillDavid/Java-OO
public class Engenheiro extends Funcionario {
	private String crea;
	
	
	public Engenheiro() {
		// TODO Auto-generated constructor stub
	}

	public Engenheiro(String nome, String crea) {
		super(nome);
		this.crea = crea;
	}
	
	public void imprimirDados() {
		System.out.println("\nNome funcionario: " + this.getNome()+"\nCREA: " + this.getCrea());
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}
	
	
	

}
 