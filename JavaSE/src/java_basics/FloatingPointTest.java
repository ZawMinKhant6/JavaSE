package java_basics;

public class FloatingPointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double doubleValue=24.23423424234124124;
		double doubleValue1=34.34148148103414241;
		double doubleMax=Double.MAX_VALUE;
		double doubleMin=Double.MIN_VALUE;
		double tenPower=1.3e31;
		
		System.out.println(doubleValue);
		System.out.println(doubleValue1);
		System.out.println(doubleMax);
		System.out.println(doubleMin);
		System.out.println(tenPower);
		
		float floatValue=24.456789994F;
		float floatValue1=-3.116786999F;
		float floatMax=Float.MAX_VALUE;
		float floatMin=Float.MIN_VALUE;
		System.out.println(floatValue);
		System.out.println(floatValue1);
		System.out.println(floatMax);
		System.out.println(floatMin);
		System.out.printf(" Max Value = %f %n", floatMax);
		System.out.printf(" Min Value = %f ", floatMin);
	}

}
