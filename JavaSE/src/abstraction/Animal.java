package abstraction;

abstract public class Animal {
	
	
	final static public String  TYPE = "LIVING_THINGS";
	
	private String species;
	
	static public void description() {
		System.out.println("This is Animal ");
		
	}
	
	public Animal(String species) {
		
		super();
		this.species=species;
	}
	

	public Animal() {
			System.out.println("Inside animal constructor");
	}
	

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	abstract protected void makeSound();
	
	abstract protected void eat();
	
	abstract protected void walk();
}
