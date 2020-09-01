import java.util.ArrayList;

public class Alocacao {
	
	private ArrayList<Pesquisador> pesquisadoresAlocacao = new ArrayList<>();
	private ArrayList<Projeto> projetoAlocacao = new ArrayList<>();
	private Data dataAlocacao;
	
	
	public Alocacao(Pesquisador pesquisadoresAlocacao, Projeto projetoAlocacao, Data dataAlocacao) {
		
	}
	
	
	

	public Data getDataAlocacao() {
		return dataAlocacao;
	}

	public void setDataAlocacao(Data dataAlocacao) {
		this.dataAlocacao = dataAlocacao;
	}
	
	
}
