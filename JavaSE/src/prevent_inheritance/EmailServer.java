package prevent_inheritance;

public class EmailServer {
	
	static final private Email[] EMAILS = new Email[20];
	
	static public void addEmail(Email email,int index) {
		EMAILS[index] = email;
	}
	
	static public Email[] readEmail() {
		return EMAILS;
	}
	
	
	// no one let instantiate
	private EmailServer() {
		
	}
}
