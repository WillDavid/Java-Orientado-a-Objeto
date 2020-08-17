
public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador() {
		
	}
	
	public Lutador(String no, String na, int id, float alt, float pes, int vit, int der, int empa) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = alt;
		this.setPeso(pes);
		setVitorias(vit);
		this.derrotas = der;
		this.empates = empa;
	}
	
	public void apresentar() {
		System.out.println("-------------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("idade: " + getIdade());
		System.out.println("Peso: " + getPeso());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Altura: " + getAltura());
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates());
	}
	
	public void status() {
		System.out.println("-------------------------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("idade: " + getIdade());
		System.out.println("Peso: " + getPeso());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Altura: " + getAltura());
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+ 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
		
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		}else if(this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if(this.peso <= 80.3) {
			this.categoria = "Médio";
		}else if(this.peso <=120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
		
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
}
