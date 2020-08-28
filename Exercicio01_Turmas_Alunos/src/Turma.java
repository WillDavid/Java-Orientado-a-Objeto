import java.util.ArrayList;

public class Turma {
	private int codigo;
	private int sala;
	private String dia;
	private String horario;
	private ArrayList<Aluno> alunos;
	
	
	public Turma(int codigo, int sala, String dia, String horario) {
		this.codigo = codigo;
		this.sala = sala;
		this.dia = dia;
		this.horario = horario;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void alocarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void mostrarAlunosTurma() {
		System.out.println("Turma: " + this.getCodigo());
		System.out.println("Sala: " + this.getSala());
		for(int i=0;i<alunos.size();i++) {
		
			System.out.println("Aluno: " + this.getAlunos().get(i).getNome()+" | Matricula: "+this.getAlunos().get(i).getMatricula()+
					" | MédiaFinal: " + this.getAlunos().get(i).getMediaFinal());
		}
		
		System.out.println("----------------------------");
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getSala() {
		return sala;
	}


	public void setSala(int sala) {
		this.sala = sala;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}


	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
	
	
	
}
