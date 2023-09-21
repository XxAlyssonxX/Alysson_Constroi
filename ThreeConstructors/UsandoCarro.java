package ThreeConstructors;

public class UsandoCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("nwy-2231");
		Carro carro2 = new Carro(392);
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro2.getChassi());

	}

}
