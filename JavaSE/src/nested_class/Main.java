package nested_class;

//import nested_class.ArithmeticOperations.Addition;
//import nested_class.ArithmeticOperations.Multiply;
//import nested_class.ArithmeticOperations.Subtraction;
//import nested_class.SecurityCheck.Check;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecurityCheck sc = new SecurityCheck("asdf234*$(");
		//Check check = sc.new Check();
		System.out.println(sc.checkPassword());;
		
//		ArithmeticOperations operations = new ArithmeticOperations(23.4,53.3);
//		Addition addition = operations.new Addition();
//		
//		System.out.println(addition.add(34.5, 12.3));
//		System.out.println(addition.add(34.5, 12.3,4.5));
//		System.out.println("String concat : "+ addition.add(" I am ", "A legend "));
//		
//		
//		Subtraction sub = operations.new Subtraction();
//		System.out.println("sub =  " + sub.sub());
//		
//		Multiply mul= operations.new Multiply();
//		System.out.println(" Mul = " + mul.mul());
//		
//		Multiply mul2= operations.new Multiply(6);
//		System.out.println(" Mul2 = " + mul2.multiplier());
//		System.out.println(Multiply.staticVar);
//		Multiply.description();
	}

}
