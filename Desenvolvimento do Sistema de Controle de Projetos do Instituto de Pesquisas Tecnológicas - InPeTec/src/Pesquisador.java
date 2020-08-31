
public class Pesquisador {
	private String matricula;
	private float salarioBase;
	private float salarioBruto;
	private String categoria;
	
	
	public Pesquisador(String matricula, float salarioBase, String categoria) {
		this.matricula = matricula;
		this.salarioBase = salarioBase;
		this.categoria = categoria;
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
