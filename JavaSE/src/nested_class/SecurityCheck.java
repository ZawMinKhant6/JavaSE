package nested_class;

public class SecurityCheck {
	private String password;

	public SecurityCheck(String password) {
		super();
		this.password = password;
	}
	
	private class Check{
		
		private String checkPassword() {
			int point =0;
			
			for (int i = 0; i < password.length(); i++) {
				
				if(Character.isLetter(password.charAt(i))) {
					point ++;
					break;
				}
			}
			
			for (int i = 0; i < password.length(); i++) {
				
			
				
				if(Character.isDigit(password.charAt(i))){
					point++;
					break;
				}
			}
			
			for (int i = 0; i < password.length(); i++) {
				char checkChar=password.charAt(i);
				
				if(!(Character.isLetter(checkChar) || Character.isDigit(checkChar))) {
					point++;
					break;
				}
			}
			
			String result="";
			if(password.length() > 8 ) {
				
				if(point <= 1) {
					 result="Password is Weak";
				}
				else if(point == 2){
					 result ="Password is Average";
				}
				else {
					 result = "Password is Strong";
				}
			}else {
				     result="Weak";
			}
			return result;
		}
	}
	
	public String checkPassword() {
		Check check = new Check();
		return check.checkPassword();
		
	}
}
