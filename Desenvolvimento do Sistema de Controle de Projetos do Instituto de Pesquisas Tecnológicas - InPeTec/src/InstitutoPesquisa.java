import java.util.ArrayList;

public class InstitutoPesquisa {
	private ArrayList<Pesquisador> pesquisadores = new ArrayList<>();
	private ArrayList<Projeto> projetos = new ArrayList<>();
	
	
	
	public void addProjeto(Projeto projeto) {
		projetos.add(projeto);
	}
	
	public void addPesquisador(Pesquisador pesquisador) {
		pesquisadores.add(pesquisador);
	}
	
	public void mostrarProjetos() {
		System.out.println("###### PROJETOS ######\nNome Custo  duração  data inicio");
		for(int i=0; i< projetos.size();i++) {
			System.out.println(this.projetos.get(i).getNomeProjeto()+ "  " + this.projetos.get(i).getCusto()
					+ "    "+ this.projetos.get(i).getDuracaoProjeto() + "   " + this.projetos.get(i).getDatainicio().getDia()+ "/" + this.projetos.get(i).getDatainicio().getMes()+"/"+
					this.projetos.get(i).getDatainicio().getAno());
		}
	}
	
	
	public void mostrarPesquisadores() {
		System.out.println("###### PESQUISADORES ######\nmatricula   nome  sal. base categoria");
		for(int i=0; i< pesquisadores.size();i++) {
			System.out.println(this.pesquisadores.get(i).getMatricula()+ "  "+ this.pesquisadores.get(i).getNome()+ "   "+ this.pesquisadores.get(i).getSalarioBase()+ "   "
					+ this.pesquisadores.get(i).getCategoria());
		}
	}
	



	public ArrayList<Pesquisador> getPesquisadores() {
		return pesquisadores;
	}



	public void setPesquisadores(ArrayList<Pesquisador> pesquisadores) {
		this.pesquisadores = pesquisadores;
	}



	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}



	public void setProjetos(ArrayList<Projeto> projetos) {
		this.projetos = projetos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
