package data_structures;

import java.util.LinkedList;

public class LinkedLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fruitList = new LinkedList<String>();
		
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Pineapple");
		fruitList.add("Orange");
		fruitList.add("Papaya");
		fruitList.add("Kiwi");
		fruitList.add("Kiwi");
		fruitList.add("Kiwi");
		fruitList.add("Kiwi");
		fruitList.add("Kiwi");
		fruitList.add("Kiwi");
		fruitList.add("Kiwi");
		fruitList.add("Kiwi");
		
		System.out.println(fruitList);
		System.out.println(fruitList.size());
		System.out.println(fruitList.get(4)); // 4 is  just a position not an index because there is not index system in LinkedList O(5);
		fruitList.remove(); // remove head Element;
		System.out.println(fruitList);
		fruitList.removeFirst();// remove first element;
		fruitList.removeLast(); // remove last element;
		fruitList.removeFirstOccurrence("Kiwi");
		fruitList.removeLastOccurrence("Kiwi");
		System.out.println(fruitList);
		
	}

}
