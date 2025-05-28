package data_structures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruitList = new ArrayList<String>(10);
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Pineapple");
		fruitList.add("Orange");
		fruitList.add("Papaya");
		fruitList.add("Kiwi");
		
		//Collections.sort(fruitList); // sort by a to z
		//Collections.reverse(fruitList); // sort by order;
		Collections.shuffle(fruitList); 
		System.out.println("Max Fruit : " + Collections.max(fruitList));
		System.out.println(fruitList);
		
//		fruitList.add("Kiwi");
//		fruitList.add("Kiwi");
//		fruitList.add("Kiwi");
//		fruitList.add("Kiwi");
//		fruitList.add("Kiwi");
//		fruitList.add("Kiwi");
//		fruitList.add("Kiwi");
//		
//		
//		ArrayList<String> newFruit = new ArrayList<String>();
//		newFruit.add("DragonFruit");
//		newFruit.add("Strawberry");
//		
//		
//		ArrayList<String> outOfStock = new ArrayList<String>();
//		outOfStock.add("Pineapple");
//		outOfStock.add("Kiwi");
//		
//		System.out.println(fruitList);
//		String orange = fruitList.get(3);
//		System.out.println("Orange : "+ orange);
//		
//		System.out.println("Containe Apple : " + fruitList.contains("Apple") );
//		System.out.println("Is FruitList Empty ? : "+ fruitList.isEmpty());
//		
//		fruitList.add(1, "Melon"); // add with index;
//		
//		fruitList.set(2, "Lyche");
//		System.out.println(fruitList);
//		
//		fruitList.addAll(0, newFruit);
//		System.out.println(fruitList);
		
		
		
//		System.out.println(fruitList);
//		System.out.println("Size = " + fruitList.size());
//		String removedString=fruitList.remove(0); // return removed object
//		System.out.println("Removed Fruit : " + removedString);
//		
//		Boolean removedStringObj = fruitList.remove("Banana");
//		System.out.println("removedStringObj : "+removedStringObj);
//		
//		Boolean removedAll = fruitList.removeAll(outOfStock); // clear outOfStock items;
//		System.out.println("Removed All : " + removedAll);
//		
//		Boolean retainedAll = fruitList.retainAll(outOfStock); // clear other items expect retain the items;
//		System.out.println("Retained All : " + retainedAll);
//		
//		fruitList.clear();
//		System.out.println(fruitList);
		
	}

}

