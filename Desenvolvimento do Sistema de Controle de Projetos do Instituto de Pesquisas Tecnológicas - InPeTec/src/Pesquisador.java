// Author: William David Martins de Almeida
// 05.09.2020
// Link GitHub: https://github.com/WillDavid/Java-OO
public class Pesquisador {
	protected String nome;
	protected String matricula;
	protected float salarioBase;
	protected float salarioBruto;
	protected String categoria;
	
	
	public Pesquisador(String nome, String matricula, float salarioBase, String categoria) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
		this.categoria = categoria;
		
	}
	
	
	public float calculaSalario() {
		if(this.categoria == "Assistente") {
			this.salarioBruto = salarioBase * 2.25f;
			
		}else if(this.categoria == "Pleno") {
			this.salarioBruto = salarioBase * 4.68f;
			
		}else if(this.categoria == "Sênior") {
			this.salarioBruto = salarioBase * 6.11f;
			
		}
		
		
		return salarioBruto;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public float getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public float getSalarioBruto() {
		return salarioBruto;
	}


	
	
	
	
	
	
	
}
