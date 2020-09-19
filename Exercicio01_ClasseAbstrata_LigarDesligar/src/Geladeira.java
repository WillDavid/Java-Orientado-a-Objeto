
public class Geladeira extends Eletrodomestico {
	private int temperatura;
	
	public Geladeira(String voltagem, float preco, boolean on_off , int temperaturaPadrao) {
		super(voltagem, preco, on_off);
		this.temperatura = temperaturaPadrao;
	}

	@Override
	public void ligar() {
		this.setOn_off(true);
		System.out.println("A geladeira ligou");

	}

	@Override
	public void desligar() {
		this.setOn_off(false);
		System.out.println("A geladeira desligou");

	}
	
	public void diminuirTemperatura() {
		if(isOn_off()) {
			temperatura--;
			System.out.println("Temperatura atual: " + this.getTemperatura()+"°c");
		}else {
			System.out.println("Geladeira desligada / Não é possivel alterar a temperatura");
		}
	}
	
	public void aumentarTemperatura() {
		if(isOn_off()) {
			temperatura++;
			System.out.println("Temperatura atual: " + this.getTemperatura()+"°c");
		}else {
			System.out.println("Geladeira desligada / Não é possivel alterar a temperatura");
		}
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	
	

}
