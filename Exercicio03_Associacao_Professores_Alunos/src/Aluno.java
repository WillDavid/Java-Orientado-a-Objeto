// Author: WIlliam David Martins de Almeida
// Data: 24.08.2020
// Link GitHub: https://github.com/WillDavid/Java-OO
import java.util.ArrayList;

public class Aluno {
	private String nomeAluno;
	
	private ArrayList<Professor> professores;
	
	
	public Aluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
		this.professores = new ArrayList<Professor>();
		
	}
	
	public void alocarProfessor(Professor professor) {
		professores.add(professor);
	}


	public String getNomeAluno() {
		return nomeAluno;
	}


	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}


	public ArrayList<Professor> getProfessores() {
		return professores;
	}


	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	
	
	
	
	
}
