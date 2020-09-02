
public class Main {

	public static void main(String[] args) {
		Assistente ass1 = new Assistente("William", "333", 800f,  "");
		Pleno ple1 = new Pleno("Diego", "444", 1230f,  "");
		
		
		
		
		
		
		Data dat01 = new Data(5,3,2001);
		
		Projeto p1 = new Projeto("projeto01", 45, dat01 , 4.899f);
		
		
		InstitutoPesquisa inpetec = new InstitutoPesquisa();
		
		inpetec.addProjeto(p1);
		
		inpetec.mostrarProjetos();
		
		inpetec.addPesquisador(ple1);
		inpetec.addPesquisador(ass1);
		
		
		inpetec.mostrarPesquisadores();
		
		Alocacao aloc1 = new Alocacao(ass1, p1, dat01);
		
		
		inpetec.addAlocacao(aloc1);
		
		inpetec.mostrarAlocacoes();
		
		
		
		
		
		
		
		
		
		

	}

}
