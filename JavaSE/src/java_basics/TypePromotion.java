package java_basics;

public class TypePromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Type Casting
		int expOne=10;
		@SuppressWarnings("unused")
		float expTypePromoteOne=expOne; //implicit;
		
		float exp=10;
		@SuppressWarnings("unused")
		int expTypePromote= (int) exp; // explicit
		
		//Type Promotion
		
		int one=10;
		float two=20;
		
		System.out.println((double)one+two);
	}

}
