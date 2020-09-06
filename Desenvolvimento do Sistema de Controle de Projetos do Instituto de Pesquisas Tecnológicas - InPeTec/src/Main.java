// Authores: William David e Leticia Minelvino
// 05.09.2020
// Link GitHub: https://github.com/WillDavid/Java-OO
public class Main {

	public static void main(String[] args) {
		
		//Criação dos pesquisadores (nome, codigo de matricula, salario base e uma string)
		Assistente ass1 = new Assistente("William", "333", 1150f,  "");
		Pleno ple1 = new Pleno("Diego", "444", 1230f,  "");
		Senior sen1 = new Senior("Roberto", "222", 1405f, "");
		
		//Criacao de datas (dia, mes, ano) e projetos (nome do projeto, duracao, a data e o custo)
		Data dat01 = new Data(5,3,2001);
		Data dat02 = new Data(13,4,2002);
		Data dat03 = new Data(10,6,2003);

		Projeto p1 = new Projeto("Projeto 01", 45, dat01 , 10.899f);
		Projeto p2 = new Projeto("Projeto 02", 23, dat02 , 4.340f);
		Projeto p3 = new Projeto("Projeto 03", 30, dat03 , 56.000f);
		
		
		//Criacao das Alocacoes (pesquisador, projeto data)
		
		Alocacao aloc1 = new Alocacao(ass1, p1, dat01);
		Alocacao aloc2 = new Alocacao(ass1, p2, dat01);
		Alocacao aloc3 = new Alocacao(ple1, p3, dat03);
		
		
		
		// Criacao do instituto
		InstitutoPesquisa inpetec = new InstitutoPesquisa();
		inpetec.iniciaInstituto(p1, ass1, aloc1);
		inpetec.iniciaInstituto(p2, sen1, aloc2);
		inpetec.iniciaInstituto(p3, ple1, aloc3);
		
		
		
		
		
		System.out.println("----- QUESTÃO 01 -----");
		inpetec.mostrarTudo(); // Metodo chamado para fins demonstrativos para a questão 01
		
		
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
		
		
		System.out.println("\n----- QUESTÃO 04 -----\n");
		
		inpetec.getProjetosPesquisador(ass1);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
