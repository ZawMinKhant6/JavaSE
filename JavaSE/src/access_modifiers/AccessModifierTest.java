package access_modifiers;

public class AccessModifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	GameCharactor noobMaster99 = new GameCharactor("noobmaster99",2000,5000,170);
	GameCharactor chouProLay = new GameCharactor("chouprolay",1500,200,130);
	
	noobMaster99.getStatus();
	System.out.println("");
	chouProLay.getStatus();
	
	System.out.println("");
	noobMaster99.attack(chouProLay);
	System.out.println("");
	System.out.println("After getting attacked by noobMaster99");
	System.out.println("");
	chouProLay.getStatus();
	
	chouProLay.fillHp(200);
	System.out.println("After hp fill");
	System.out.println("");
	chouProLay.getStatus();
	
	System.out.println("Base Damage => " + GameCharactor.baseDmg);
	System.out.println("noobMaster99 Damage => " + noobMaster99.damage);
	}

}
