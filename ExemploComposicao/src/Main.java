
public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Jose", "PAA");
		
		
		funcionario.addDependente("Joao", "pai", funcionario);
		funcionario.addDependente("Maria", "Irma", funcionario);
		
		
		System.out.println("Funcionario: "+funcionario.getNome());
		System.out.println("Matricula: "+funcionario.getMatricula());
		
		System.out.println(funcionario.obterDependentes());
		
		

	}

}
