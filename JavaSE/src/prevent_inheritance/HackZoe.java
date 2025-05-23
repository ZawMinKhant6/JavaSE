package prevent_inheritance;

public class HackZoe {
	
	@SuppressWarnings("unused")
	private String bankAccount;
	
	
	
	public HackZoe(String bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}



//	public void hijeck() {
//			
//		for(Email email:EmailServer.readEmail()) {
//			if(email == null) {
//				continue;
//			}
//			
//			email.setFrom("??????");
//			email.setSubject("Transfer money you want back your information" + bankAccount);
//			email.setAttachment("trojan");
//
//		}
//	}
}
