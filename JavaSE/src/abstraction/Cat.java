package abstraction;

public class Cat extends Animal {
	
	public Cat() {
		super("warm blooded");
		System.out.println("Inside Cat default constructor");
	}
	

	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("meow meow");
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat meat");
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk like cat");
	}

}
