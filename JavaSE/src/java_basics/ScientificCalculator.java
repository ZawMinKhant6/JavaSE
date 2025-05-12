package java_basics;

import java.util.Scanner;

public class ScientificCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner userInput = new Scanner(System.in);
				System.out.println("1 . Two operand operations  2 .  One operand operations");
				int operandDecision = userInput.nextInt();
				System.out.println("Enter Operand One : ");
				double operandOne = userInput.nextDouble();
				
				switch (operandDecision) {
				case 1 ->{
					System.out.println("Enter Operand Two");
					double operandTwo = userInput.nextDouble();
					System.out.println("1. add 2. sub 3. multi 4. divide 5. power 6. modulus");
					int operation = userInput.nextInt();
					System.out.println("Result is : " +calculateTwoOperand(operandOne,operandTwo,operation));
				}
				
				case 2 -> {
					
					System.out.println("1.sin 2.cos 3.tan 4.asin 5.acos 6.atan 7.sinh 8.cosh 9.tanh 10.log10 11.ln 12.log x+1 13.round 14.ceil 15.floor 16.sqrt 17.exp");
					int operation = userInput.nextInt();
					System.out.println("Result is : " +calculateOneOperand(operandOne,operation));
				}
				
				default -> {System.out.println("Invalid Operation");}
				
				}
				 userInput.close();
			}
			
			static double calculateTwoOperand(double operandOne, double operandTwo , int operation) {
				
				return switch (operation) {
				case 1 -> operandOne + operandTwo;
				case 2 -> operandOne - operandTwo;
				case 3 -> operandOne * operandTwo;
				case 4 -> operandTwo != 0 ? operandOne / operandTwo : 0.0;
				case 5 -> Math.pow(operandOne, operandTwo);
				case 6 ->  operandOne % operandTwo;
				default -> 0.0;
				
				};
				
			};
			
			static double calculateOneOperand(double operandOne,int operation) {
				
				return switch (operation) {
				case 1 -> Math.toDegrees(Math.sin(operandOne));
				case 2 -> Math.cos(operandOne);
				case 3 -> Math.tan(operandOne);
				case 4 -> Math.asin(operandOne);
				case 5 -> Math.acos(operandOne);
				case 6 ->  Math.atan(operandOne);
				case 7 -> Math.sinh(operandOne);
				case 8 -> Math.cosh(operandOne);
				case 9 -> Math.tanh(operandOne);
				case 10 -> Math.log10(operandOne);
				case 11 -> Math.log(operandOne);
				case 12 -> Math.log1p(operandOne);
				case 13 -> Math.round(operandOne);
				case 14 -> Math.ceil(operandOne);
				case 15 -> Math.floor(operandOne);
				case 16 -> Math.sqrt(operandOne);
				case 17 -> Math.exp(operandOne);
			
				
				default -> 0.0;
				
				};
	}

}
