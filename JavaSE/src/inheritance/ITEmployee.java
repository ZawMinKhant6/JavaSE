package inheritance;

public class ITEmployee {
	
	protected String name;
	String role;
	String email;
	@SuppressWarnings("unused")
	private String secrect;
	protected int passcode=1122;
	
	public ITEmployee(){
		System.out.println("Insie ITEmployee no args constructor");
	}
	
	public ITEmployee(String name) {
		this.name= name;
		System.out.println("Inside ITEmployee one args constructor");
	}
	
	void writeCode() {
		System.out.println(name+" is writing code");
	}
	
	void thinkALgorithm() {
		System.out.println(name+" is thinking algorithm");
	}
}
