package predicate;

import java.util.function.Predicate;

public class SimplePredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> evenOrOdd = (n1) -> n1%2 == 0 ;
		
		System.out.println(evenOrOdd.test(20) ? "Even" : "Odd");
		
		
		Predicate<String> isFirstDigit = (s1) -> Character.isDigit(s1.charAt(0)) ;
		
		System.out.println(isFirstDigit.test("4Test") ? "Start with digit test" : "No it does not start with digit");
		
		
	}

}
