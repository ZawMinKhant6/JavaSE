package generic;

public class WildCardTest {
	
//	static void identifyBox(Box<Integer> box) {
//		System.out.println(box.get().getClass());
//	}
	
	static void identifyBox(Box<?> box) {
		System.out.println(box.get().getClass());
	}
	
	static void identifyNumberBox(Box<? extends Number> box) {
		System.out.println(box.get().getClass());
	}
	
	static void identifyDoubleBox(Box<? super Number> box) {
		System.out.println(box.get().getClass());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Box<Integer> intBox = new Box<>();
//		intBox.add(2000);
//		identifyBox(intBox);
		
//		Box<Double> doubleBox = new Box<>();
//		doubleBox.add(2000.009);
//		identifyBox(doubleBox);
		
		Box<Object> objBox = new Box<Object>();
		objBox.add(2000);
		identifyBox(objBox);
		Integer intObj = (Integer) objBox.get();
		
		Box<String> strBox = new Box<String>();
		strBox.add("Apple");	
		identifyBox(strBox);	
		
		SmartPhone smartPhone= new SmartPhone();
		Box<SmartPhone> smartPhoneBox = new Box<SmartPhone>();	
		smartPhoneBox.add(smartPhone);
		identifyBox(smartPhoneBox);	
	}

}
