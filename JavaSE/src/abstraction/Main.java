package abstraction;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// cannot instantiate Animal animal = new Animal()
		
		Animal animal = new Bird();
		animal.makeSound();
		animal.eat();
		animal.walk();
		System.out.println("Bird species : " + animal.getSpecies());
		
		animal = new Cat();
		animal.makeSound();
		animal.eat();
		animal.walk();
		System.out.println("Cat species : " + animal.getSpecies());
		
		animal = new Rabbit();
		animal.makeSound();
		animal.eat();
		animal.walk();
		System.out.println("Rabbit species : " + animal.getSpecies());
		
		System.out.println("TYPE " +Animal.TYPE);
		animal.description();
		
	}

}
