package dependency;

import java.util.Set;

public class ChickenCurry {
	
	final private Chicken chicken;
	final private Set<Flavour> flavours;
	final private Oil oil;
	
	

	public ChickenCurry(Chicken chicken, Set<Flavour> flavours, Oil oil) {
		super();
		this.chicken = chicken;
		this.flavours = flavours;
		this.oil = oil;
	}
	
	
	public void cook() {
		if(chicken == null) {
			System.out.println("Chicken is Require!");
			return;
		}
		
		if(oil == null) {
			System.out.println("Oil is Require!");
			return; 
		}
		if(flavours == null || flavours.isEmpty()) {
			System.out.println("Flavour is Require!");
			return ;
		}
		
		System.out.println("Chicken curry cooked");
		flavours.forEach(n -> System.out.println(n) );
	}
	

}
