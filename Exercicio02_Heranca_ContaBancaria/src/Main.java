
public class Main {

	public static void main(String[] args) {
		System.out.println("-----Conta Corrente-----");
		ContaCorrente cc1 = new ContaCorrente("William D", 5555, 50.0f, 100.0f);
		
		cc1.mostrarSaldo();
		cc1.depositarCC(30);
		cc1.mostrarSaldo();
		cc1.sacarCC(20);
		cc1.mostrarSaldo();
		
		
		System.out.println("\n-----Conta Poupança-----");
		
		
		ContaPoupanca cp1 = new ContaPoupanca("Jorge D", 5643, 563.0f, "24.05");
		
		cp1.mostrarRendimento(15);
	}

}
