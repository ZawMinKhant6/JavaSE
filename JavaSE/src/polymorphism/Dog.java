package polymorphism;

public class Dog extends Animal {

	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Woof Woof");
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		System.out.println("Beef");
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		System.out.println("Lazy Walk");
	}
	
	public void bite() {
		System.out.println("Dog can bite");
	}
	
	public void loyal() {
		System.out.println("Dogs are loyal");
	}
	
}
