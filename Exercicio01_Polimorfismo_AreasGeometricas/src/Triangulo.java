
public class Triangulo extends FiguraGeometrica {

	public Triangulo(float altura, float base) {
		super(altura, base);
		
	}
	
	
	public void calculaArea() {
		
		this.setArea((getBase()*getAltura())/2);
	}

}
