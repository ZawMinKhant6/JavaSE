package java_basics;

public class StringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello"; // interning -> string pool -> Hello
		s1="Orange" ; //
		String s2="Hello"; // interning -> reference of existed hello obj;
		String s3 =s2;
		System.out.println(s1); // s1's address -> object -> state 
		
		System.out.println("S1 == S2 ? " + (s1==s2)); // concatenation;
		System.out.println("S1 == S3 ? " + (s1==s3));
		System.out.println("S2 == S3 ? " + (s2==s3));
		
		
		String s4 =new String("Hello"); // heap ->hello;
		String s5 =new String("Hello");// heap -> another hello;
		System.out.println("S4 == S5 ? " + (s4 == s5));
		System.out.println("S1 == S4 ? " + (s2==s4));
		
		System.out.println("Value of S1 = " + s1);
		System.out.println("Value of S2 = " + s2);
		System.out.println("Value of S3 = " + s3);
		
		System.out.println(" Is S2 Value == S4 : " + s2.equals(s4));
		
		
	}

}
