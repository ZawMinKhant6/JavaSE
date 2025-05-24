package abstraction;

public class Rabbit extends Animal {
	
	public Rabbit() {
		super("warm blooded");
		System.out.println("Inside  Rabbit default constructor");
	}
	
	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("shuu shuu");
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat grass");
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk like rabbit");
	}

}
