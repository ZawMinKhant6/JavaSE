package predicate;

import java.util.function.Predicate;

public class ChainedPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> checkStrLength = (str) -> str.length() > 30 ;
		Predicate<String> endWithDot = (str) -> str.endsWith(".");
		Predicate<String> capitalize = (str) -> Character.isUpperCase(str.charAt(0));
		
		String sentence = "My name is MgMg. sjfskjfl f kfljsf jsjf ks dfkl fklaef s fkfkls klfklsj skldjflksjflklf.";
		boolean outcome1 = checkStrLength.negate().test(sentence);
		System.out.println("short Sentence ? : " + outcome1);
		
//		String sentence = "My name is Zaw Min Khant.";
//		boolean outcome1 = checkStrLength.or(endWithDot).or(capitalize).test(sentence);
//		System.out.println("Valid Or sentence ? :  " + outcome1);
//		
//		String sentence = "My name is MgMg. sjfskjfl f kfljsf jsjf ks dfkl fklaef s fkfkls klfklsj skldjflksjflklf.";
//		
//		boolean outcome1 = checkStrLength.and(endWithDot).and(capitalize).test(sentence);
//		
//		System.out.println("Valid Long Sentence ? :  " + outcome1);
		
	
	}

}
