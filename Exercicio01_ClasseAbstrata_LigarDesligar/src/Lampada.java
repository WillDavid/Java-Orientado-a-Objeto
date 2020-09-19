
public abstract class Lampada extends Eletrodomestico {
	private String cor;
	public Lampada(String voltagem, float preco, boolean on_off, String cor) {
		super(voltagem, preco, on_off);
		this.cor = cor;
	}
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	

	

}
