package java_basics;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// escaping char;
		
		String mgmgWord="mgmg said \"I want to become programmer\""; 
		System.out.println(mgmgWord);
		String str1 = "I like an 'Areoplane'";
		System.out.println(str1);
		char singleQuote='\'';
		System.out.println(singleQuote);
		
		String countries= "Myanmar,Japan,Thailand,Korea,UK";
		String[] splitedString= countries.split(",");
		
		for(String tempVar:splitedString) {
			System.out.println(tempVar);
		}
		
		String joinedString= String.join("-", splitedString);
		System.out.println(joinedString);
		String test= "My name is MgMg.";
		@SuppressWarnings("unused")
		String emptyString="";
		@SuppressWarnings("unused")
		String nullString =null;
		@SuppressWarnings("unused")
		String blankString="  ";
		String spacedString= "         I am      spaced Text.          ";
		
         //replaced
		
		
		String replacedString=test.replace("MgMg", "TunTun");
		System.out.println(replacedString);
		
		//spacing remove
		System.out.println(spacedString + " .More Text");
		System.out.println(spacedString.trim()+ ".More Text.");
//	
		
		// case conversion;
		String testUpperCase=test.toUpperCase();
		String testLowerCase=test.toLowerCase();
		
		System.out.println(testUpperCase);
		System.out.println(testLowerCase);
		
	// checking 
		
//		System.out.println("Start with My : " + test.startsWith("Apple"));
//		System.out.println("End with . : " + test.endsWith("."));
//		System.out.println("Is Empty : " + emptyString.isEmpty());
//		System.out.println("Is blank : " + emptyString.isBlank());
		
		// String length or size;
		
//		int length =test.length();
//		System.out.println("test has contain : " + length + " character " );
		
		// extract sub string
		
//		String name = test.substring(11,15);
//		System.out.println(name);
//		System.out.println(test.substring(8));
	
		
		// searching
		
		// boolean containMgMg=test.contains("MgMg"); // char or char sequence; // case sensitive;
//		boolean containMgMg=test.contains("mgmg"); 
//		System.out.println("contain MgMg = " + containMgMg);
		
		// Examine Character;
		
//		char smallM=test.charAt(5);
//		System.out.println("Small M = " + smallM);
//		
//		System.out.println("Index 8 = " + test.charAt(8));
//		
//		int indexOfg=test.indexOf("g"); // return the index of the first letter // the first g;
//		System.out.println(indexOfg);
//		System.out.println("Index of name = " + test.indexOf("name"));
//		System.out.println("Last index of g = " + test.lastIndexOf("g"));
	
		
	}

}
