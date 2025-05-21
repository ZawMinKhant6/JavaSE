package final_modifier;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("### Client App ###");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Your Username");
		String username = userInput.nextLine();
		System.out.println("Enter Your Password");
		String password = userInput.nextLine();
		userInput.close();
		
		final Authentication auth = FakeDatabase.authenticate(username, password);
		
		// hackzoe;
//		Authentication fakeAuth = new Authentication("HackZoe","999");
//		auth = fakeAuth;
		
	
		
		if(auth != null) {
		
			//if(auth.username.equals("hackzoe")) auth.premium  = true;
			
			System.out.println("Welcome : " + auth.username);
			System.out.println("Login Granted");
			System.out.println(auth.premium ? "You can Access premiun features" : "You can Access normal features");
		}
		else {
			System.out.println("Hello Stranger , Login Access is denied");
		}
		
	}

}
