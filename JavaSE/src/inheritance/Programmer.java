package inheritance;

public class Programmer extends ITEmployee {
	
	
	String programmerCode;
	int passcode = 2233;
	
	public Programmer() {
		
		super();
		System.out.println("Inside Programmer no args constructor");
		System.out.println("passcode : " + super.passcode);
	}
	

	void testing() {
		//System.out.println(secrect);
		
		System.out.println(name+" is testing");
	}
}
