
public abstract class Eletrodomestico {
	private String voltagem;
	private float preco;
	private boolean on_off;
	
	public Eletrodomestico(String voltagem, float preco, boolean on_off) {
		this.voltagem = voltagem;
		this.on_off = on_off;
		this.preco = preco;
	}
	
	public abstract void ligar();
	
	
	public abstract void desligar();
	


	public String getVoltagem() {
		return voltagem;
	}


	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public boolean isOn_off() {
		return on_off;
	}


	public void setOn_off(boolean on_off) {
		this.on_off = on_off;
	}
	
	
	
	
	
	
	
}
