
public class ContaPoupanca extends ContaBancaria {
	
	private String dataAniversario;
	private float rendimento;
	
	public ContaPoupanca(String nome, int numeroConta, float saldo, String dataAniversario) {
		super(nome, numeroConta, saldo);
		this.dataAniversario = dataAniversario;
		
		
	}
	
	public void mostrarRendimento(float porcentagem) {
		this.rendimento = saldo * (porcentagem/100);
		System.out.println("Seu saldo: " + this.getSaldo());
		System.out.println("Porcentagem: " + (porcentagem/100));
		System.out.println("O rendimento é: " + this.getRendimento());
	}

	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	
	
	
	
	
	
	

}
