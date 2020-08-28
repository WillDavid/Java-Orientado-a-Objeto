
public class Main {

	public static void main(String[] args) {
		Turma turma01 = new Turma(567, 03, "Segunda-feira", "10:00");
		Turma turma02 = new Turma(789, 02, "Terça-Feira", "11:00");
		
		
		
		Aluno aluno01 = new Aluno("Ricardo", 17043, 9.0f);
		Aluno aluno02 = new Aluno("Jorge", 18454, 5.0f);
		Aluno aluno03 = new Aluno("Ricardo", 17043, 8.0f);
		Aluno aluno04 = new Aluno("Joana", 16983, 3.0f);
		Aluno aluno05 = new Aluno("Maria", 16904, 10.0f);

		
		
		turma01.alocarAluno(aluno01);
		turma01.alocarAluno(aluno02);
		turma01.alocarAluno(aluno03);
		turma01.mostrarAlunosTurma();
		
		
		turma02.alocarAluno(aluno04);
		turma02.alocarAluno(aluno05);
		turma02.mostrarAlunosTurma();
		
		
		
		
		

	}

}
