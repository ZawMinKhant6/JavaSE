package final_modifier;

public class FinalModifierTest {
	
	final static double PI = 3.142;
	final static int NO_DAY_WEEK =7;
	final int stateConstant;
	
	
	public FinalModifierTest(int stateConstant) {
		super();
		this.stateConstant = stateConstant;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalModifierTest test = new FinalModifierTest(2000);
		System.out.println("State Constant : "+ test.stateConstant);
		
		//test.stateConstant=5000;
		
		final int localConstant; /* = 2000 */;
		 // localConstant = 7000;
		localConstant = 8000;
		
		System.out.println(localConstant);
		System.out.println("PI" + PI);
		System.out.println("Number of Week : " + NO_DAY_WEEK);
		
		
	}

}
