package java_basics;

public class MethodAccess {
	
	static int staticVar =50000;
	int instanceVar=10000;
	
	static void staticMethod() {
		System.out.println("Inside Static Method");
	}
	
	void instanceMethod() {
		System.out.println("Inside Instance Method");
		System.out.println(staticVar);
		staticMethod();
	}
	
	static void testReturn(int value) {
		if(value > 100) {
			return;
		}
		System.out.println("Ohter statment of this method");
	}
}
