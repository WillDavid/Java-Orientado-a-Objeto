// Author: William David Martins de Almeida
// Date: 21.08.2020
// Link repository: https://github.com/WillDavid/Java-OO
public class CalculoMedia {
	private double somatorioPorTurma, somatorioGeral;
	
	public CalculoMedia(double somatorioPorTurma) {
		this.somatorioPorTurma = somatorioPorTurma;
	}
	
	
	public double MediaGeral(double somatorioGeral) {
		somatorioGeral = somatorioGeral/3;
		return somatorioGeral;
	}
	
	public double MediaTurma(double somatorioPorTurma) {
		somatorioPorTurma = somatorioPorTurma/5;
		return somatorioPorTurma;
	}

	
	public double getSomatorioPorTurma() {
		return somatorioPorTurma;
	}
	public void setSomatorioPorTurma(double somatorioPorTurma) {
		this.somatorioPorTurma = somatorioPorTurma;
	}
	public double getSomatorioGeral() {
		return somatorioGeral;
	}
	public void setSomatorioGeral(double somatorioGeral) {
		this.somatorioGeral = somatorioGeral;
	}
	
	
}
