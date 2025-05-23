package polymorphism;

public class Gorilla extends Animal{
	
	
	@Override
	protected void eat() {
		System.out.println("Banana");
	}
	
	@Override
	protected void walk() {
		System.out.println("Walk like human");
	}
	
	@Override
	protected void makeSound() {
		super.makeSound();
		System.out.println("Wuu Wuu War War");
	}
}
