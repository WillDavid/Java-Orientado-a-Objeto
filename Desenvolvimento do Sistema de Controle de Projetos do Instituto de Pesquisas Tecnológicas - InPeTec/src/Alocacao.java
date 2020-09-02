
public class Alocacao {
	
	private Pesquisador pesquisadoresAlocacao ;
	private Projeto projetoAlocacao;
	private Data dataAlocacao;
	
	public Alocacao(Pesquisador pesquisadoresAlocacao, Projeto projetoAlocacao, Data dataAlocacao) {
		this.pesquisadoresAlocacao = pesquisadoresAlocacao;
		this.projetoAlocacao = projetoAlocacao;
		this.dataAlocacao = dataAlocacao;
	}
	public Pesquisador getPesquisadoresAlocacao() {
		return pesquisadoresAlocacao;
	}
	public void setPesquisadoresAlocacao(Pesquisador pesquisadoresAlocacao) {
		this.pesquisadoresAlocacao = pesquisadoresAlocacao;
	}
	public Projeto getProjetoAlocacao() {
		return projetoAlocacao;
	}
	public void setProjetoAlocacao(Projeto projetoAlocacao) {
		this.projetoAlocacao = projetoAlocacao;
	}
	public Data getDataAlocacao() {
		return dataAlocacao;
	}
	public void setDataAlocacao(Data dataAlocacao) {
		this.dataAlocacao = dataAlocacao;
	}
	
	
	
	
}
