import java.util.ArrayList;

public class InstitutoPesquisa {
	private ArrayList<Pesquisador> pesquisadores = new ArrayList<>();
	private ArrayList<Projeto> projetos = new ArrayList<>();
	private ArrayList<Alocacao> alocacoes = new ArrayList<>();
	
	
	public InstitutoPesquisa() {
		
	}
	
	
	public void iniciaInstituto(Projeto projeto, Pesquisador pesquisador, Alocacao alocacao) {
		addProjeto(projeto);
		addPesquisador(pesquisador);
		addAlocacao(alocacao);
	}

	public void addProjeto(Projeto projeto) {
		projetos.add(projeto);
	}
	
	public void addPesquisador(Pesquisador pesquisador) {
		pesquisadores.add(pesquisador);
	}
	
	public void addAlocacao(Alocacao alocacao) {
		alocacoes.add(alocacao);
	}
	
	public void mostrarProjetos() {
		System.out.println("\n###### PROJETOS ######\nNome Custo  duração  data inicio");
		for(int i=0; i< projetos.size();i++) {
			System.out.println(this.projetos.get(i).getNomeProjeto()+ "  " + this.projetos.get(i).getCusto()
					+ "    "+ this.projetos.get(i).getDuracaoProjeto() + "   " + this.projetos.get(i).getDatainicio().getDia()+ "/" + this.projetos.get(i).getDatainicio().getMes()+"/"+
					this.projetos.get(i).getDatainicio().getAno());
		}
	}
	
	//    ESSE MÉTODO PODE SER UTILIZADO NA QUESTÃO 3, BASTA CHAMAR O OBJETO.mostrarAlocacoes();
	public void mostrarPesquisadores() {
		System.out.println("\n###### PESQUISADORES ######\nmatricula   nome  sal. base categoria");
		for(int i=0; i< pesquisadores.size();i++) {
			System.out.println(this.pesquisadores.get(i).getMatricula()+ "  "+ this.pesquisadores.get(i).getNome()+ "   "+ this.pesquisadores.get(i).getSalarioBase()+ "   "
					+ this.pesquisadores.get(i).getCategoria());
		}
	}
	
	public void mostrarAlocacoes() {
		System.out.println("\n###### ALOCAÇÕES ######\nPesquisador   Projeto   Data Entrada");
		for(int i=0; i< alocacoes.size();i++) {
			System.out.println(this.alocacoes.get(i).getPesquisadoresAlocacao().getNome()+"   "+ this.alocacoes.get(i).getProjetoAlocacao().getNomeProjeto()+"   " + this.alocacoes.get(i).getDataAlocacao().getDia()
					+"/" + this.alocacoes.get(i).getDataAlocacao().getMes()+"/" + this.alocacoes.get(i).getDataAlocacao().getAno());
		}
	}
	
	/*     ESSE MÉTODO PODE SER UTILIZADO NA QUESTÃO 2, BASTA CHAMAR O OBJETO.listarPesquisadores();
	 *
	public void listarPesquisadores() {
		System.out.println("###### PESQUISADORES ######\nMATRICULA   NOME   SAL.BASE   SAL.BRUTO    CATEGORIA");
		for(int i=0; i<pesquisadores.size();i++) {
			
			float salarioBruto = pesquisadores.get(i).calculaSalario();
			System.out.println(this.pesquisadores.get(i).getMatricula()+"        "+this.pesquisadores.get(i).getNome()
					+"   "+this.pesquisadores.get(i).getSalarioBase()+"        "+ salarioBruto+"       "+ this.pesquisadores.get(i).getCategoria());
		}
	}
	
	*/

	public ArrayList<Pesquisador> getPesquisadores() {
		return pesquisadores;
	}

	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}

	public ArrayList<Alocacao> getAlocacoes() {
		return alocacoes;
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
}
