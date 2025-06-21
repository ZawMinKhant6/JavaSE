package ontomany;

public class OneToManyTest {
	
	public static void main(String[] args) {
		Team manU = new Team("Man U");
		Player player = new Player ("Onana");
		Player playerTwo = new Player ("Maguire");
		
		
		manU.getPlayers().add(player);
		manU.getPlayers().add(playerTwo);
		
		System.out.println("Man U Players -- "+ manU.getPlayers() );
		
	}
}
