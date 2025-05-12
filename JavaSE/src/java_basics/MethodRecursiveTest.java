package java_basics;

public class MethodRecursiveTest {

	
		//bad practice // you should use loop instead of this
		static int factorial(int n) {
			if(n > 1) {
				return n*factorial(n-1);
			}
			else {
				return 1;
			}
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.println("5! = " + factorial(5));
		}
	}


