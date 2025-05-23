
package polymorphism;

public class Main {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal=new Cat();
		animal.makeSound();
		animal.eat();
		animal.walk();
		
		Cat cat= (Cat) animal;
		cat.jump();
		cat.scrapt();
		((Cat)animal).jump();
		((Cat)animal).scrapt();
		
		if(animal instanceof Dog) {
			Dog dog= (Dog) animal;
			dog.bite();
			dog.loyal();
		}else {
			System.out.println("Appointed object is not  dog type");
		}
//		Dog dog= (Dog) animal;
//		dog.bite();
//		dog.loyal();
		
		animal=new Dog();
		animal.makeSound();
		animal.eat();
		animal.walk();
		if(animal instanceof Dog) {
			Dog dog= (Dog) animal;
			dog.bite();
			dog.loyal();
		}else {
			System.out.println("Appointed object is not  dog type");
		}
		
		animal = new Gorilla();
		animal.makeSound();
		animal.eat();
		animal.walk();


	}
	
	
}
