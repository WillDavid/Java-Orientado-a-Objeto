
public class Main {

	public static void main(String[] args) {
		Assistente ass1 = new Assistente("William", "333", 1150f,  "");
		Pleno ple1 = new Pleno("Diego", "444", 1230f,  "");
		
		
		
		
		
		
		
		Data dat01 = new Data(5,3,2001);
		
		Projeto p1 = new Projeto("projeto01", 45, dat01 , 4.899f);
		
		
		InstitutoPesquisa inpetec = new InstitutoPesquisa();
		
		System.out.println("----- QUESTÃO 01 -----");
		
		inpetec.addProjeto(p1);
		
		inpetec.mostrarProjetos();
		
		inpetec.addPesquisador(ple1);
		inpetec.addPesquisador(ass1);
		
		
		inpetec.mostrarPesquisadores();
		
		Alocacao aloc1 = new Alocacao(ass1, p1, dat01);
		
		
		inpetec.addAlocacao(aloc1);
		
		inpetec.mostrarAlocacoes();
		
		
		System.out.println("\n----- QUESTÃO 02 -----\n");
		System.out.println("###### PESQUISADORES ######\nMATRICULA   NOME   SAL.BASE   SAL.BRUTO    CATEGORIA");
		for(int i=0; i<inpetec.getPesquisadores().size();i++) {
			float salarioBruto = inpetec.getPesquisadores().get(i).calculaSalario();
			System.out.println(inpetec.getPesquisadores().get(i).getMatricula()+"        "+inpetec.getPesquisadores().get(i).getNome()
					+"   "+inpetec.getPesquisadores().get(i).getSalarioBase()+"        "+salarioBruto+"       "+ inpetec.getPesquisadores().get(i).getCategoria());
		}
		
		// Existe uma função semelhante na classe InstitutoPesquisa.jva, denominada listarPesquisadore(), ela está comentada abaixo;
		// inpetec.listarPesquisadores();
		
		System.out.println("\n----- QUESTÃO 03 -----\n");
		System.out.println("\n###### ALOCAÇÕES ######\nPesquisador   Projeto   Data Entrada");
		for(int i=0; i< inpetec.getAlocacoes().size();i++) {
			System.out.println(inpetec.getAlocacoes().get(i).getPesquisadoresAlocacao().getNome()+"   "+inpetec.getAlocacoes().get(i).getProjetoAlocacao().getNomeProjeto()+
					"   "+inpetec.getAlocacoes().get(i).getDataAlocacao().getDia()+"/"+inpetec.getAlocacoes().get(i).getDataAlocacao().getMes()+"/"+
					"/"+inpetec.getAlocacoes().get(i).getDataAlocacao().getAno());
			
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
