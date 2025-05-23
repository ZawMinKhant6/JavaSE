package polymorphism;

public class Cat extends Animal {
	
	@Override
	protected void makeSound() {
		System.out.println("Meow Meow");
	}
	
	@Override
	protected void eat() {
		System.out.println("Cat food");
	}
	
	@Override
	protected void walk() {
		System.out.println("Cat walk");
	}
	
	public void jump() {
		System.out.println("1.5 meter");
	}
	
	public void scrapt() {
		System.out.println("Cat can scrapt");
	}
}
