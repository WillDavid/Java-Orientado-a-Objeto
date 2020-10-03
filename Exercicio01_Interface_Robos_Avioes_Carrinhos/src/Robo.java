
public class Robo extends Brinquedo implements Mobilidade {

	public Robo(float peso, String modelo, String material) {
		super(peso, modelo, material);
		
	}

	public Robo() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void moverTras() {
		System.out.println("Robo moveu para trás");

	}

	@Override
	public void moverFrente() {
		System.out.println("Robo moveu para frente");

	}

	@Override
	public void parar() {
		System.out.println("Robo parou");

	}

	@Override
	public void emitirSinal() {
		System.out.println("Robo está emitindo um sinal");

	}

}
