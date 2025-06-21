package dependency;

import java.util.HashSet;
import java.util.Set;

public class ChickenCurryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken burmeseChicken = new Chicken("Burmese Chicken");
		Oil peanutOil = new Oil("Peanut Oil");
		Flavour salt = new Flavour("salt");
		Flavour chili = new Flavour("chili");
		Flavour msg = new Flavour("msg");
		Set<Flavour> flavours = new HashSet<Flavour>();
		flavours.add(salt);
		flavours.add(chili);
		flavours.add(msg);
		
		ChickenCurry chickenCurry = new ChickenCurry(burmeseChicken,flavours,peanutOil);
		chickenCurry.cook();
	}

}
