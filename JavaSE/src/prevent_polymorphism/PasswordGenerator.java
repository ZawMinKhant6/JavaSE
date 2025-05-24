package prevent_polymorphism;

public class PasswordGenerator {
	
	
	final public  String generate(int Strength) {
		
		String chars= "ABCDEFGHIJKLNMOPQRSTUVWXYZabcdefghijklnmopqrstuvwxyz0123456789!@#$%^&*()";
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < Strength; i++) {
				int index = (int) (chars.length() * Math.random());
				sb.append(chars.charAt(index)) ;
				
		}
		
		return sb.toString();
	}
	
	
}
