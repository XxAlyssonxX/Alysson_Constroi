package ThreeConstructors;

public class UsandoAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("azul");
		Animal animal2 = new Animal(173);
		
		System.out.println(animal1.getCor());
		System.out.println(animal2.getTamanho());

	}

}

