
public class Main {

	public static void main(String[] args) {
		Triangulo tri01 = new Triangulo(3.0f, 5.0f);
		
		
		Retangulo ret01 = new Retangulo(3.0f, 5.0f);
		
		
		tri01.calculaArea();
		
		ret01.calculaArea();
		
		
		System.out.println("Area do triangulo: " + tri01.getArea());
		System.out.println("Area do retangulo: "+ret01.getArea());
	}

}
