// Author: William David Martins de Almeida
// 05.09.2020
// Link GitHub: https://github.com/WillDavid/Java-OO
import java.util.ArrayList;

public class InstitutoPesquisa {
	private ArrayList<Pesquisador> pesquisadores = new ArrayList<>();
	private ArrayList<Projeto> projetos = new ArrayList<>();
	private ArrayList<Alocacao> alocacoes = new ArrayList<>();
	
	
	public InstitutoPesquisa() {
		
	}
	
	
	public void iniciaInstituto(Projeto projeto, Pesquisador pesquisador, Alocacao alocacao) {
		projetos.add(projeto);
		pesquisadores.add(pesquisador);
		alocacoes.add(alocacao);
		
		
	}
	//   MÉTODOS PARA ADIÇÃO DE PESQUISADORES, ALOCAÇÕES OU PROJETOS
	//   DE FORMA INDIVIDUAL
	/*
	public void addProjeto(Projeto projeto) {
		projetos.add(projeto);
	}
	
	public void addPesquisador(Pesquisador pesquisador) {
		pesquisadores.add(pesquisador);
	}
	
	public void addAlocacao(Alocacao alocacao) {
		alocacoes.add(alocacao);
	}
	 */


	// METODO CONSTRUIDO PARA FINS DEMONSTRATIVOS DA QUESTÃO 01
	public void mostrarTudo() {
		System.out.println("\n###### PROJETOS ######\nNome Custo  duração  data inicio");
		for(int i=0; i< projetos.size();i++) {
			System.out.println(this.projetos.get(i).getNomeProjeto()+ "  " + this.projetos.get(i).getCusto()
					+ "    "+ this.projetos.get(i).getDuracaoProjeto() + "   " + this.projetos.get(i).getDatainicio().getDia()+ "/" + this.projetos.get(i).getDatainicio().getMes()+"/"+
					this.projetos.get(i).getDatainicio().getAno());
		}
		
		System.out.println("\n###### PESQUISADORES ######\nmatricula   nome  sal. base categoria");
		for(int i=0; i< pesquisadores.size();i++) {
			System.out.println(this.pesquisadores.get(i).getMatricula()+ "  "+ this.pesquisadores.get(i).getNome()+ "   "+ this.pesquisadores.get(i).getSalarioBase()+ "   "
					+ this.pesquisadores.get(i).getCategoria());
		}
		
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
	
	public void getProjetosPesquisador(Pesquisador pesquisador) {
		System.out.println("Pesquisador: " + pesquisador.getNome() + "\nProjetos:");
		for(int i = 0; i<getAlocacoes().size();i++) {
			if(alocacoes.get(i).getPesquisadoresAlocacao() == pesquisador) {
				System.out.println(alocacoes.get(i).getProjetoAlocacao().getNomeProjeto());
			}
		}
	}

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
