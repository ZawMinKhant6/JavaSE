package generic;

public class GenericMethodTest {
	
	
	static <T extends Comparable<T>> T max(T t1, T t2, T t3, T t4){
		T max = t1;
		
		if(t2.compareTo(max) > 0) {
			max= t2;
		}
		if(t3.compareTo(max) > 0) {
			max= t3;
		}
		if(t4.compareTo(max) > 0) {
			max= t4;
		}
		return max;
	}
	
	static <E> void printArray( E[] array) {
		for(final E e:array) {
			System.out.print(e + " " );
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray = {10,20,30,40,50,60,70,80,90,100};
		Double[] doubleArray = {12.23,324.23,23.22,23.232,643.33,3457.33};
		String[] stringArray = {"Apple","Mango","Banana","Orange"};
		
		
		System.out.println("max of 45,22,60,50 : " + max(45, 22, 60, 50));
		System.out.println("max of 22.33,44.55,61.2,13.3 : " + max(22.33, 44.55,61.2 , 13.3));
		System.out.println("max of Apple , Kiwi , Orange , Papaya : " + max("Apple", "Kiwi", "Orange", "Papaya"));
		
//		SmartPhone smartPhone1= new SmartPhone("Hawei","Hawei P90",4039000.55);
//		SmartPhone smartPhone2=new SmartPhone("Xiomi","Mi Mid 4",6000434.55);
//		SmartPhone smartPhone3=new SmartPhone("Nubia","Nubia red magic",800.99);
//		
//		SmartPhone[] smartPhoneArray= {
//				smartPhone1,
//				smartPhone2,
//				smartPhone3
//		};
//		
//		printArray(intArray);
//		printArray(doubleArray);
//		printArray(stringArray);
//		printArray(smartPhoneArray);
//		
	}

}
