package java_basics;

public class VarArgsMethod {
static int infinityMultiply(boolean test,int... numArray) {
		
		int result =1;
		for(int element : numArray ) {
			result *= element;
		}
		
		return result;
		
	}
	
// bad practice	static int infinityMultiply(int[] numArray) {
//		
//		int result =1;
//		for(int element : numArray ) {
//			result *= element;
//		}
//		
//		return result;
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {10,20,30};
		int[] array2 = {10,20,30,40,50};
		int[] array3 = {10,20,30,11,22,33,44};
		//int[] array4 = {};
		
		System.out.println("array1 : " +VarArgsMethod.infinityMultiply(true,array1));
		System.out.println("array2 : " +VarArgsMethod.infinityMultiply(true,array2));
		System.out.println("array3 : " +VarArgsMethod.infinityMultiply(false,array3));
		System.out.println("empty : " + VarArgsMethod.infinityMultiply(false));
		System.out.println("10 * 4 : " + VarArgsMethod.infinityMultiply(true,10,4));
		System.out.println("5*6*7 : " + VarArgsMethod.infinityMultiply(true,5,6,7));
		
	}
}
