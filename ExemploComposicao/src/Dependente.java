// Autor: William David Martins de Almeida
// 20.08.2020 - Projetos de Programa - JAVAOO
public class Dependente {
	private String nome;
	private String parentesco;
	private Funcionario funcionario;
	
	public Dependente(String nomeDependente, String parentescoDependente, Funcionario funcionarioDependente) {
		this.nome = nomeDependente;
		this.parentesco = parentescoDependente;
		this.funcionario = funcionarioDependente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
	
	
	
}
