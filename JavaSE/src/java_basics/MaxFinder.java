package java_basics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxFinder {

	
		
		int maxFinder(int number1 , int number2) {
			
			int max=number1;
			if(number2 > number1) {
				max=number2;
			}
			 return max;
		}
		
		int maxFinder(int...numbers) {
			int max=numbers[0];
			for(int number :numbers) {
				if(number > max) {
					max= number;
				}
			}
			return max;
		}
		
		static void max() {
			System.out.println("Max finder is to find the maximum number");
		}
		
		  // duplicate
		double max (double number1, double number2, double number3) {
			
			System.out.println("Inside three int argus method");
			double max =number1;
			
			if(number2 > max) {
				max =number2;
			}
			if(number3 > max) {
				max =number3;
			}
			
			return max;
			
		}
		
		String max(String oneS,String twoS) {
			String maxString="";
		    List<String> arrayList = new ArrayList(Arrays.asList(oneS));
		    arrayList.addAll(Arrays.asList(twoS));
		    arrayList.toArray();
		    for(String cha : arrayList) {
		    	System.out.println(cha);
		    	
		    }
		    return maxString;
		}
	

}
