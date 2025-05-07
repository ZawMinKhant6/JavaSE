
package java_basics;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = {"apple","orange","banana","strawberry","papaya"};
		
		// good practice	
		for(String fruit:fruits) {
			System.out.println("Fruits name is "+fruit);
		}
		
		//bad practice is when we use general loop on Array Objects;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a Pattern : ");
		int patternNumber= userInput.nextInt();
		
		for(int i=1 ; i <= patternNumber ; i++ ) {
			for(int l = 1 ; l <= patternNumber ; l++) {
				System.out.printf("%d ", i);
			}
			System.out.println("");
		}
		
		
		System.out.println("Prime Number Finder -> Enter number: ");
		int inputNumber = userInput.nextInt();
		int count = 0;
		int loopTime = 0;
		
		
		for(int i=1 ; i <= inputNumber ; i++ ) {
			loopTime++;
			if( inputNumber % i == 0) {
			  count++;
			}
		}
		
		System.out.println((count > 2) ? "It is prime number":"It is not prime number");
		System.out.println("Count and Loop Time : "+ count+ " And " + loopTime);
		userInput.close();
		
	}

}
