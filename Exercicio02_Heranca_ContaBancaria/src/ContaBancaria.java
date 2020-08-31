
public class ContaBancaria {
	private String nome;
	private int numeroConta;
	protected float saldo;
	
	
	public ContaBancaria(String nome, int numeroConta, float saldo) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void mostrarSaldo() {
		System.out.println("Seu saldo é de: " + this.getSaldo());
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	
}
