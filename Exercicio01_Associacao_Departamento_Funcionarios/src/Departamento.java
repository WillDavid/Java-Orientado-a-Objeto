import java.util.ArrayList;

public class Departamento {
	private String nomeDepartamento;
	private ArrayList<Funcionario> funcionarios;
	private int qtdMinFuncionarios;
	
	
	public Departamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
		this.funcionarios = new ArrayList<Funcionario>();
		this.qtdMinFuncionarios = 1;
	}
	
	public void alocarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}


	public String getNomeDepartamento() {
		return nomeDepartamento;
	}


	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}


	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}


	public int getQtdMinFuncionarios() {
		return qtdMinFuncionarios;
	}


	public void setQtdMinFuncionarios(int qtdMinFuncionarios) {
		this.qtdMinFuncionarios = qtdMinFuncionarios;
	}
	
	
	
}
