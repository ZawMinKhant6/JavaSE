package lambda;

public class BlockLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testable leapYear = y -> {
			if((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) {
				return true;
			}
			else {
				return false;
			}
		};
		
		long year = 2024;
		System.out.println(leapYear.test(year) ? "Yes leap year" : "No it is not leap year");
		
		Testable factorial = n -> {
			
			if(n  <= 20) {
				Long result = 1L;
				for(int i =1 ; i <= n ; i++) {
					result *= i;
				}
				System.out.println("n factorial = " + result);
				return true;
			}
			else {
				return false;
			}
		};
		
		if(factorial.test(18)) {
			System.out.println("Your number can be factorial");
		}
		else {
			System.out.println("Your number cannot be factorial");
		}
	}

}
