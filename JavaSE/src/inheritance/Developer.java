package inheritance;

public class Developer extends ITEmployee {
	

	String developerCode;
	
	public Developer() {
		super();
		System.out.println("Inside Developer No arga constructor");
	}
	
	
	void createClassDesign() {
		System.out.println(name+" is creating class design");
	}
}
