package lambda;

public class SimpleLambda {
	
	static void generateKey(int key, Randomizer random) {
			System.out.println( key * random.random());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculatable add = (n1,n2) -> n1+n2;
		double result = add.cal(20.0, 30.0);
		System.out.println("result1 = "+result);
		
		Calculatable sub = (n1,n2) -> n1-n2;
		double result2 = sub.cal(30.0, 20.0);
		System.out.println("result2 = " + result2);
		
		Calculatable mul = (n1,n2) -> n1 * n2;
		double result3 = mul.cal(20.0, 30.0);
		System.out.println("result3 = " + result3);
		
		Randomizer rand1000 = () -> (int)(Math.random() * 1000);
		double result4 = rand1000.random();
		System.out.println("result4 = "+result4);
		
		generateKey(32, rand1000);
	}

}
