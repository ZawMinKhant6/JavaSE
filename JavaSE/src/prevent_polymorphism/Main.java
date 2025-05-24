package prevent_polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PasswordGenerator generator=new Test() ;
		// PasswordGenerator();
		Scanner userInput= new Scanner(System.in);
		System.out.print("Enter The Strength Of Your Password : ");
		int strength= userInput.nextInt();
		userInput.close();
		
		System.out.println("Generated Password Is : " + generator.generate(strength));
		

	}

}
