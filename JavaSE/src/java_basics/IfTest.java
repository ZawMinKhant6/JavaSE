package java_basics;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.print(1.6678e3);
		
		Scanner userInput =new  Scanner(System.in);
		System.out.println("Enter a number : 1 to 7 : ");
		int day =userInput.nextInt();
		userInput.close();
		
		
		// should not // bad practice;
		if(day == 1) System.out.println("Sad Monday");
		else if(day == 2) System.out.println("Boring Tuesday");
		else if(day == 3) System.out.println("Active Wednesday");
		else if(day == 4) System.out.println("Hopeful Thursday");
		else if(day == 5) System.out.println("Happy Friday");
		else if(day == 6) System.out.println("Drinking Saturday");
		else if(day == 7) System.out.println("Sleeping Sunday");
		else {
			System.out.println("Invalid Data");
		}
		
		boolean nrc= false;
		int age=22;
		
		if(nrc && age >= 18) {
			System.out.println("Your NRC is checked up ");
			System.out.println("You can Vote");
			
		}
		else {
			System.out.println("You cannot vote");
		}
		
		if(nrc) {
			System.out.println("Your NRC is checked up ");
			if(age >=18) {
				System.out.println("You can Vote");
			}
			else {
				System.out.println("You are under Age");
			}
		}
		else {
			System.out.println("You cannot vote");
		}
		int x= 10;
		
//		statment
		
		if(x > 10) System.out.println("x is greater then 10");
		
		if(x > 10){
			
			System.out.println("X is Integer");
			System.out.println("X is greather then 10");
			
		}
		else if( x == 10){
			System.out.println("X is Equal to 10");
		}
		else {
			System.out.println("X is not greater then 10");
		}
		
		System.out.println("Out Of if");
	}

}
