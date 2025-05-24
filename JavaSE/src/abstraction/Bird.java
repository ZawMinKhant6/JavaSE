package abstraction;

public class Bird extends Animal {
	
	public Bird() {
		super("warm blooded");
		System.out.println("Inside Bird default constructor");
	}
	
	@Override
	protected void makeSound() {
		System.out.println("Kyali Kyali");
		
	}

	@Override
	protected void eat() {
		System.out.println("Eat grain");
		
	}

	@Override
	protected void walk() {
		System.out.println("Walk Like Bird");
		
	}

}
