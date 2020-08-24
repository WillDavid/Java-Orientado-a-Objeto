// Author: WIlliam David Martins de Almeida
// Data: 24.08.2020
// Link GitHub: https://github.com/WillDavid/Java-OO
import java.util.ArrayList;

public class Professor {
	private String nomeProfessor;
	private ArrayList<Aluno> alunos;
	
	public Professor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
		this.alunos = new ArrayList<Aluno>();
		
		
	}
	
	public void alocarAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
}
