package access_modifiers;

public class GameCharactor {
	
	public static int baseDmg=100;
	
	public String name;
	public int hp;
	public int mp;
	public int damage;
	
	
	public GameCharactor(String name, int hp, int mp, int damage) {
		
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.damage = damage;
	}

	public void attack(GameCharactor otherCharactor) {
			
			int effectDamage= baseDmg+ damage;
			System.out.println(name + "Attack => " + otherCharactor.name);
			System.out.println(otherCharactor.name + "Take => " + effectDamage + " Damage");
			otherCharactor.hp -= effectDamage;
	}
	
	public void fillHp(int hp) {
		this.hp+=hp;
	}
	
	public void fillMp(int mp) {
		this.mp=mp;
	}
	
	public void getStatus() {
		System.out.println( name + " Status :=> ");
		System.out.println("Hp  => " + hp);
		System.out.println("Mp  => " + mp);
		System.out.println("Damage  => " + damage);
	}
}
