
public class Main {

	public static void main(String[] args) {
		Funcionario funcionario01 = new Funcionario("Daiana", 01);
		Funcionario funcionario02 = new Funcionario("Fernando", 02);
		Funcionario funcionario03 = new Funcionario("Maria", 03);
		Funcionario funcionario04 = new Funcionario("Jorge", 04);
		
		Departamento departamento01 = new Departamento("RH");
		Departamento departamento02 = new Departamento("Amoxarifado");
		
		
		departamento01.alocarFuncionario(funcionario01);
		departamento01.alocarFuncionario(funcionario02);
		departamento02.alocarFuncionario(funcionario03);
		departamento02.alocarFuncionario(funcionario04);
		
		System.out.println("\nNome do departamento: " + departamento01.getNomeDepartamento()+
				"\nLista de Funcionários: ");
		for(int i=0; i < departamento01.getFuncionarios().size(); i++) {
			System.out.println(departamento01.getFuncionarios().get(i).getNome());
		}
		
		
		System.out.println("\nNome do departamento: " + departamento02.getNomeDepartamento()+
				"\nLista de Funcionários: ");
		for(int i=0; i < departamento02.getFuncionarios().size(); i++) {
			System.out.println(departamento02.getFuncionarios().get(i).getNome());
		}
		
		

	}

}
