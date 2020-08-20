// Autor: William David Martins de Almeida
// 20.08.2020 - Projetos de Programa - JAVAOO

import java.util.ArrayList;

public class Funcionario {
	private String nome, matricula;
	private ArrayList<Dependente> dependentes = new ArrayList<Dependente>();
	
	public Funcionario(String nomeFuncionario, String matriculaFuncionario) {
		this.nome = nomeFuncionario;
		this.matricula = matriculaFuncionario;
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
	
	public void addDependente(String nome, String parentesco, Funcionario funcionario) {
		dependentes.add(new Dependente(nome, parentesco, funcionario));
	}
	
	
	public String obterDependentes() {
		String retorno = "Lista de dependentes\n";
		for(int i = 0; i<this.dependentes.size();i++) {
			retorno+= "Nome: "+this.dependentes.get(i).getNome()+"\n" + "Parentesco: " + this.dependentes.get(i).getParentesco()+"\n";
			
		}
		
		return retorno;
	}

	
	
	
	
}
