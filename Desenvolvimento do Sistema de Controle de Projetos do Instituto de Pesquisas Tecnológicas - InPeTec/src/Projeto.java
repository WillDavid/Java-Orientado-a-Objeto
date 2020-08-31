
public class Projeto {
	private String nomeProjeto;
	private int duracaoProjeto;
	private String dataInicioProjeto;
	private float custo;
	
	
	public Projeto(String nomeProjeto, int duracaoProjeto, String dataInicioProjeto, float custo) {
		this.nomeProjeto = nomeProjeto;
		this.duracaoProjeto = duracaoProjeto;
		this.dataInicioProjeto = dataInicioProjeto;
		this.custo = custo;
	}


	public String getNomeProjeto() {
		return nomeProjeto;
	}


	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}


	public int getDuracaoProjeto() {
		return duracaoProjeto;
	}


	public void setDuracaoProjeto(int duracaoProjeto) {
		this.duracaoProjeto = duracaoProjeto;
	}


	public String getDataInicioProjeto() {
		return dataInicioProjeto;
	}


	public void setDataInicioProjeto(String dataInicioProjeto) {
		this.dataInicioProjeto = dataInicioProjeto;
	}


	public float getCusto() {
		return custo;
	}


	public void setCusto(float custo) {
		this.custo = custo;
	}
	
	
	
	
	
}
