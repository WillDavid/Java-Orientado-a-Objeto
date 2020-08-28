
public class Aluno {
	private String nome;
	private int matricula;
	private float mediaFinal;
	
	public Aluno(String nome, int matricula, float mediaFinal) {
		this.matricula = matricula;
		this.nome = nome;
		this.mediaFinal = mediaFinal;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public float getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(float mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	
	
	
}