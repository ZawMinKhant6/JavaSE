package java_basics;

import java.util.Scanner;

public class NewSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	 while(true) {
		 Scanner userInput = new Scanner(System.in);
		   System.out.println("Enter Operand One : ");
		   int operandOne = userInput.nextInt();
		   System.out.println("Enter Operand Two : ");
		   int operandTwo = userInput.nextInt();
		   System.out.println("Enter Operators ");
		   char operator = userInput.next().charAt(0);
		   
		   
		   int result = switch (operator) {
		    
		   case '+' : {
			   yield operandOne+operandTwo;
		   }
		   case '-' : {
			   yield operandOne-operandTwo;
		   }
		   case '*' : {
			   yield operandOne*operandTwo;
		   }
		   case '%' : {
			   yield operandOne%operandTwo;
		   }
		   
		   case '^' : {
			   if(operandTwo <=4 && operandTwo > 1) {
				   yield switch(operandTwo) {
				    
				   case 2 : {
					   yield operandOne*operandOne;
				   }
				   case 3 : {
					   yield operandOne*operandOne*operandOne;
				   }
				   case 4 : {
					   yield operandOne*operandOne*operandOne*operandOne;
				   }
				   
				   default : yield 0;
				   };
			   }
		   }
		   
		   default: yield 0;
		   };
		   
		   if(result > 0) {
			   System.out.println("The result is " + result);
		   }else {
			   System.out.println("Invalid Operator");
		   }
		   
		   System.out.println("Do you want to continue Y/N : ");
		   char choose = userInput.next().charAt(0);
		   if(choose == 'Y') {
			   continue;
		   }
		   else {
			   break;
		   }
		   
	 }
	  
		
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter Number 1 to 7 : ");
//		int day = userInput.nextInt();
//		userInput.close();
//		
//		switch (day) {
//		case 1 -> {
//			System.out.println("Work Day");
//		}
//		case 2 -> {
//			System.out.println("Work Day");
//		}
//		case 3 -> {
//			System.out.println("Work Day");
//		}
//		case 4 -> {
//			System.out.println("Work Day");
//		}
//		case 5 -> {
//			System.out.println("Work Day");
//		}
//		case 6 -> {
//			System.out.println("Work Day");
//		}
//		case 7 -> {
//			System.out.println("It is Holiday");
//		}
//	
//		default ->
//		throw new IllegalArgumentException("Unexpected data: " + day);
//		}
		
	}

}
