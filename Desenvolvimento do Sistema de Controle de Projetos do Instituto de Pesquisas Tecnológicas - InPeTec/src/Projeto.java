// Authores: William David e Leticia Minelvino
// 05.09.2020
// Link GitHub: https://github.com/WillDavid/Java-OO
public class Projeto {
	private String nomeProjeto;
	private int duracaoProjeto;
	private Data datainicio;
	private float custo;
	
	
	
	
	public Projeto(String nomeProjeto, int duracaoProjeto, Data datainicio, float custo) {
		this.nomeProjeto = nomeProjeto;
		this.duracaoProjeto = duracaoProjeto;
		this.datainicio = datainicio;
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
	
	
	public Data getDatainicio() {
		return datainicio;
	}


	public void setDatainicio(Data datainicio) {
		this.datainicio = datainicio;
	}



	public float getCusto() {
		return custo;
	}


	public void setCusto(float custo) {
		this.custo = custo;
	}


	
	
	
	
	
	
}
