package box_primitive;

public class BoxPrimitive {
	
	static void methodOne(Double d) {
		System.out.println("Inside Box parameter method : " + d);
	}
	
	static void methodTwo(double d) {
		System.out.println("Inside primitive parameter method : " + d);
	}
	
	static void check( char test) {
		if(Character.isLetter(test)) {
			System.out.println("Test is a letter");
		}
		else if(Character.isDigit(test)) {
			System.out.println("Test is a digit");
		}
		else {
			System.out.println("Test is a Symbol");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("unused")
		Character letter = 'g';
		check('9');
		check('G');
		check('$');
		
		
//		double d = 3000.345;
//		methodOne(d);
//		
//		Double dObj = 3000.345;
//		methodTwo(dObj);
	
		
		
		//Operations
		
//		System.out.println("Bytes : " + Integer.BYTES);
//		System.out.println("Sizes : " + Integer.SIZE);
//		System.out.println("bit pattern of 3450 : " + Integer.toBinaryString(3450));
//		System.out.println("Bit Count : " + Integer.bitCount(3450));
//		System.out.println("Hex : " + Integer.toHexString(3450));
//		System.out.println("Octal : " + Integer.toOctalString(3450));
//		
//		Integer parseInteger= Integer.parseInt("100000");
//		System.out.println("ParseInteger : " + parseInteger);
//		
//		Integer intObj3= Integer.valueOf("500000");
//		System.out.println("valueOf : " + intObj3);
		
//		Integer intObj = new Integer(1000);
//		System.out.println("intObj :" + intObj);
//		
//		int a = 5000;
//		Integer intObj2 = new Integer(a);
//		
//		int b = intObj2.intValue();
//		byte d= intObj2.byteValue();
//		short e = intObj2.shortValue();
//		
//		
//		System.out.println("intObj2 : "+ intObj2);
//		
//		System.out.println("b : "+ b);
//		System.out.println("d : "+ d);
//		System.out.println("e : "+ e);

	}
	

}
