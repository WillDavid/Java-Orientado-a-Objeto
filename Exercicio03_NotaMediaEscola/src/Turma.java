// Author: William David Martins de Almeida
// Date: 21.08.2020
// Link repository: https://github.com/WillDavid/Java-OO
public class Turma {
	private double nota, somatorio;
	
	public Turma(double nota) {
		this.nota = nota;
	
		
	}
	
	
	public double mediaTurma() {
		somatorio = somatorio/5;
		return somatorio;
	}
	

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}


	public double getSomatorio() {
		return somatorio;
	}


	public void setSomatorio(double somatorio) {
		this.somatorio = somatorio;
	}
	
	
	
	
}
