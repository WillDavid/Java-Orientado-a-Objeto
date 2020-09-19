
public class Main {

	public static void main(String[] args) {
		TV tv1 = new TV("220V", 1000f, false , 0);
		
		
		tv1.trocarCanalMenos();
		
		tv1.ligar();
		
		tv1.trocarCanalMais();
		
		tv1.desligar();
		
		System.out.println("--------------");
		Geladeira g1 = new Geladeira("220V", 500f, false, 10);
		
		g1.aumentarTemperatura();
		g1.ligar();
		
		g1.aumentarTemperatura();
		
		
		System.out.println("---------Abstrato de Abstrato---------");
		
		LampadaLED led1 = new LampadaLED("110V", 50f, false, "Branca");
		
		led1.ligar();
		led1.desligar();
		
	}

}
