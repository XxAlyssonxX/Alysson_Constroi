package ThreeConstructors;

public class Animal {
	private float tamanho;
	private String cor;

	public Animal() {

	}

	public Animal(float tamanho) {
		this.tamanho = tamanho;
	}

	public Animal(String cor) {
		this.cor = cor;
	}

	public float getTamanho() {
		return tamanho;
	}

	public String getCor() {
		return cor;
	}

}
