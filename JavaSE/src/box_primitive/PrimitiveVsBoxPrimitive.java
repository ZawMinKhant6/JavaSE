package box_primitive;

public class PrimitiveVsBoxPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime=System.currentTimeMillis();
		System.out.println(testWithPrimitive());
		long endTime = System.currentTimeMillis() - startTime ;
		System.out.println("End Time : " + endTime + "ms"); /*649 ms*/
		
//		long startTime=System.currentTimeMillis();
//		System.out.println(testWithBoxPrimitive());
//		long endTime = System.currentTimeMillis() - startTime ;
//		System.out.println("End Time : " + endTime + "ms"); /* 13058 ms*/
		
		
		
	}
	
	static long testWithPrimitive() {
		long result = 0L;
		
		for(long i =1L; i <= Integer.MAX_VALUE ; i++) {
			result = result +i;
		}
		return result;
	}
	
	static Long testWithBoxPrimitive() {
		Long result = 0L;
		
		for(Long i =1L; i <= Integer.MAX_VALUE ; i++) {
			result = result +i;
		}
		return result;
	}
}
