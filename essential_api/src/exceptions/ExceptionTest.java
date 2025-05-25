package exceptions;

public class ExceptionTest {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nullStringNull = null;
		
		if(nullStringNull != null) {
			System.out.println(nullStringNull.charAt(0));
		}
		else {
			System.out.println("Null String is null");
		}
		
		int neg=-5;
		int[] array = new int[Math.abs(neg)];
		System.out.println(array.length);
		
//		int[] array = new int[5];
//		int index=6;
//		
//		if(index < array.length) {
//			System.out.println(array[6]);
//		}
//		else {
//			System.out.println("Array index out of bound");
//		}
		
		// flow check to avoid run time exceptions
//		double op1=100;
//		double op2=20;
//		
//		if(op2==0) {
//			System.out.println("op2  is 0. Therefore can't divide");
//		}
//		
//		else {
//			System.out.println(op1/op2);
//		}
		
		//bad practice
		try {
			String nullString=null;
			nullString.charAt(0);
			int[] negativearray = new int[-3];
			int[] intarr = new int[4];
			System.out.println(intarr[6]=8);
			System.out.println(100/0);
		} catch (ArithmeticException ex) {
			// TODO: handle exception
			System.out.println("ArithmeticException is caught");
			ex.printStackTrace();		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array Index Out of bound exception");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("An Exception is caught");
			e.printStackTrace();
		}
		System.out.println("Other System is Working");
	}

}
