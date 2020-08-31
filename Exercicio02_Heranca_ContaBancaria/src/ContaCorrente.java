
public class ContaCorrente extends ContaBancaria {
	private float limiteCC;

	public ContaCorrente(String nome, int numeroConta, float saldo, float limiteCC) {
		super(nome, numeroConta, saldo);
		this.limiteCC = limiteCC;
		
	}
	
	
	public void depositarCC(float valor) {
		this.saldo = saldo + valor;
		System.out.println("Você depositou " + valor);
	}
	
	public void sacarCC(float valor) {
		this.saldo = saldo - valor;
		System.out.println("Você sacou " + valor);
	}
	
	public void realizarPagamento(float valor) {
		this.saldo = saldo - valor;
	}
	
	public void fazerTransferencia(float valor) {
		this.saldo = saldo - valor;
	}


	public float getLimiteCC() {
		return limiteCC;
	}


	public void setLimiteCC(float limiteCC) {
		this.limiteCC = limiteCC;
	}
	
	

}
