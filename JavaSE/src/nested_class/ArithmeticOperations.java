package nested_class;

public class ArithmeticOperations {
	
	private double op1;
	private double op2;
	
	public ArithmeticOperations() {
		
	}
	
	
	
	public ArithmeticOperations(double op1, double op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}



	public class Addition {

		public double add(double op1 ,double op2) {
			
			return op1+op2;
		}
		
		public double add(double op1 ,double op2,double op3) {
				
				return op1+op2+op3;
		}
		
		public String add(String s1,String s2) {
			return s1+s2;
		}
	}
	
	 class Subtraction{
		
		 double sub() {
			return op1-op2;
		}
	}
	 
	 class Multiply{
		 
		 static int staticVar=10000;
		 private int multiplier;
		 
		 static void description() {
			 System.out.println("Blue print for multiplying");
		 }
		 
		public Multiply() {
			
		}
		 
		 public Multiply(int multiplier) {
			super();
			this.multiplier = multiplier;
		}



		double mul() {
			 return op1*op2;
		 }
		
		double multiplier() {
			return (op1 + op2)* multiplier;
		}
	 }
	
}
