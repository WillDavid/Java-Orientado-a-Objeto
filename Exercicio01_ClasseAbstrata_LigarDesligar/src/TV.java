
public class TV extends Eletrodomestico {
	private int numeroCanal;
	private int volume;

	public TV(String voltagem, float preco, boolean on_off, int volume) {
		super(voltagem, preco, on_off);
		this.volume = volume;
		this.numeroCanal = 1;
		
		
	}

	@Override
	public void ligar() {
		this.setOn_off(true);
		System.out.println("A TV ligou");
	}

	@Override
	public void desligar() {
		this.setOn_off(false);
		System.out.println("A TV desligou");

	}
	
	public void trocarCanalMais() {
		if(isOn_off()) {
			numeroCanal++;
			if(numeroCanal > 10) {
				numeroCanal = 1;
			}
			System.out.println("N° canal: " + this.getNumeroCanal());
		}else {
			System.out.println("TV desligada / Não é possivel trocar de canal");
		}
		
	}
	
	public void trocarCanalMenos() {
		if(isOn_off()) {
			numeroCanal--;
			if(numeroCanal < 0) {
				numeroCanal = 10;
			}
			System.out.println("N° canal: " + this.getNumeroCanal());
		}else {
			System.out.println("TV desligada / Não é possivel trocar de canal");
		}
		
		
		
	}
	


	public int getNumeroCanal() {
		return numeroCanal;
	}

	public void setNumeroCanal(int numeroCanal) {
		this.numeroCanal = numeroCanal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	

}
