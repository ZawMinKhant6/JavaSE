package polymorphism;

public class Zoo {
		
	private Animal[] animals = new Animal[30];
	
	protected void addAnimal(Animal animal,Integer index) {
		System.out.println("Added animal : "+ animal);
		animals[index]=animal;
	}
	
	protected void showAnimal() {
		for(Animal ani:animals) {
			if(ani==null) {
				continue;
			}
			System.out.println(ani);
			ani.eat();
			ani.walk();
			ani.makeSound();
			
			
		}
	}
	
}
