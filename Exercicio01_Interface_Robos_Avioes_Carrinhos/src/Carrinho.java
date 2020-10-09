
public class Carrinho  extends Brinquedo implements Mobilidade {

	public Carrinho(float peso, String modelo, String material) {
		super(peso, modelo, material);
		
	}
	
	public Carrinho() {
		
	}
	
	@Override
	public void moverTras() {
		System.out.println("Carrinho moveu para trás");

	}

	@Override
	public void moverFrente() {
		System.out.println("Carrinho moveu para frente");

	}

	@Override
	public void parar() {
		System.out.println("Carrinho parou");

	}

	@Override
	public void emitirSinal() {
		System.out.println("Carrinho está emitindo um sinal");

	}

}
