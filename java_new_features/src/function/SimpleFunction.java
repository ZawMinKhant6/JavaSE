package function;

import java.util.function.Function;

public class SimpleFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> 	indexBFunc =  s -> s.indexOf('b');
		System.out.println(indexBFunc.apply("Asemble"));
		
		Function<Integer, Double> 	oneFourth =  i -> i/4.0; // one by fourth of 100
		System.out.println(oneFourth.apply(100));
	}

}
