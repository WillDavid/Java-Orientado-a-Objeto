
public class LampadaLED extends Lampada {

	public LampadaLED(String voltagem, float preco, boolean on_off, String cor) {
		super(voltagem, preco, on_off, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligar() {
		this.setOn_off(true);
		System.out.println("Lampada Ligada");

	}

	@Override
	public void desligar() {
		this.setOn_off(true);
		System.out.println("Lampada Desligada");

	}
	
	
	

}
