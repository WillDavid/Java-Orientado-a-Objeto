
public class Brinquedo implements Mobilidade {
	
	private float peso;
	private String modelo;
	private String material;
	
	public Brinquedo(float peso, String modelo, String material) {
		this.peso = peso;
		this.modelo = modelo;
		this.material = material;
	}
	
	public Brinquedo() {
		
	}
	
	

	@Override
	public void moverTras() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moverFrente() {
		// TODO Auto-generated method stub

	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emitirSinal() {
		// TODO Auto-generated method stub

	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	

}
