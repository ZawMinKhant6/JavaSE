package prevent_inheritance;

public class EmailClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sender mgmg = new Sender("mgmg@gmail.com");
		mgmg.sendEmail("masapal@gmail.com", "just Greeting", "greet.txt", 0);
		
	   Sender kyawkyaw = new Sender("kk@gmail.com");
		kyawkyaw.sendEmail("masapal@gmail.com", "meeting schedule", "schedule.txt", 1);
		
//		HackZoe hackzoe = new HackZoe("100 2300 3400 4561 1100");
//		hackzoe.hijeck();
		
		Recipient masapal = new Recipient("masapal@gmail.com");
		masapal.readMail();
	}

}
