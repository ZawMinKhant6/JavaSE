package java_basics;

import java.util.Scanner;

public class OldSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter Your number 1 to 7 : ");
			int number =  userInput.nextInt();
			userInput.close();
			
			// Switch Expression
			
			switch(number) {
			case 1 : case 2 : case 3 : case 4 : case 5 : case 6 : System.out.println("It is work day");
			
			default : System.out.println("Invalid Data");
			}
			// Switch Statement
//			switch(number) {
//			case 1 :{
//				System.out.println("Work day");
//				break;
//			}
//			case 2 :{
//				System.out.println("Work day");
//			}
//			case 3 :{
//				System.out.println("Work day");
//			}
//			case 4 :{
//				System.out.println("Work day");
//			}
//			case 5 :{
//				System.out.println("Work day");
//			}
//			case 6 :{
//				System.out.println("Work day");
//			}
//			
//			case 7 :{
//				System.out.println(" It is Holiday");
//			}
//			
//			default : {
//				System.out.println("It is Invalid Data");
//			}
//			}
	}

}
