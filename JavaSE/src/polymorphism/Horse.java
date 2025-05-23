package polymorphism;

public class Horse extends Animal {

	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("hee hee");
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat grass");
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk like horse");
	}
  
	
	
}
