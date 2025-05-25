package generic;

public class Box <T> {
		
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	
	//bad practice
//	private Object obj;
//	
//	public void add(Object obj) {
//		this.obj = obj;
//	}
//	
//	public Object get() {
//		return obj;
//	}
	
}
