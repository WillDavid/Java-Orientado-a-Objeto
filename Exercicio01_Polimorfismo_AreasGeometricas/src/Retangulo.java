
public class Retangulo extends FiguraGeometrica {

	public Retangulo(float altura, float base) {
		super(altura, base);
		// TODO Auto-generated constructor stub
	}
	
	public void calculaArea() {
		
		this.setArea(getBase()*getAltura());
	}
}
