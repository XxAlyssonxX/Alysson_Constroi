package ThreeConstructors;

public class Carro {
	private String placa;
	private int numChassi;
	
	public Carro(String placa) {
		this.placa = placa;
	}
	
	public Carro(int numChassi) {
		this.numChassi = numChassi;
	}

	public String getPlaca() {
		return placa;
	}
	
	public int getChassi() {
		return numChassi;
	}

}
