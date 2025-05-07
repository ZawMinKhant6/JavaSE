package java_basics;

import java.util.Scanner;

public class LabelBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = {{20,30,40},{42,45,56},{43,76,45}};
		
		
		
		while(true) {
			
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter the number you want to find : ");
			int  number= userInput.nextInt();
			int  theNumberOfFinds=0;
			search:
			for(int[] array:numbers) {
				for(int l=0 ; l<array.length; l++) {
					if(number == array[l]) {
						theNumberOfFinds++;
						continue;
					}
					else {
						break search;
					}
				}
			}
			System.out.println("We found the Number " + theNumberOfFinds + " times");
			System.out.println("Do you want to continue Searching ? Y/N -> ");
			char choose = userInput.next().charAt(0);
			
			if(choose=='Y') {
				continue;
			}else {
				System.out.println("The Program is Terminated");
				userInput.close();
				
			}
		}
		
	}

}
