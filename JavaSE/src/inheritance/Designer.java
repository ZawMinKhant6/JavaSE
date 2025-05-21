package inheritance;

public class Designer extends ITEmployee {
	
	
	String designerCode;
	
	public Designer() {
		super("Zaw Min Khant");
		System.out.println("Inside Designer no args Constructor");
	}
	
	void createArt() {
		System.out.println(name+" is creating Art");
	}
}
