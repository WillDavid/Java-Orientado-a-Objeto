
public class Pesquisador {
	private String nome;
	private String matricula;
	private float salarioBase;
	private float salarioBruto;
	private String categoria;
	
	
	public Pesquisador(String nome, String matricula, float salarioBase, String categoria) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
		this.categoria = categoria;
	}
	
	
	public void calculaSalario() {
		if(this.categoria == "Assistente") {
			this.salarioBruto = salarioBase * 2.25f;
			System.out.println("Salario Bruto: " + this.salarioBruto);
		}else if(this.categoria == "Pleno") {
			this.salarioBruto = salarioBase * 4.68f;
			System.out.println("Salario Bruto: " + this.salarioBruto);
		}else if(this.categoria == "Sênior") {
			this.salarioBruto = salarioBase * 6.11f;
			System.out.println("Salario Bruto: " + this.salarioBruto);
		}
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
