package java_basics;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =100;
		int l=0;
		while (x <= 100) {
			
			l++;
			System.out.println(" x is still  100");
			System.out.println("Loop "+l);
			if(l==5) {
				
				x=101;
				break;
			}
		}
		
		
		do {
			
			System.out.println("Starting Do ( While x is on the final loop of 100)");
		
		}
		while(x == 100);
		System.out.println("x is greater then 100 now");
	}

}
