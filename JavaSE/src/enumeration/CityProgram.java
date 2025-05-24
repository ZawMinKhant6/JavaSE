package enumeration;

import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class CityProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("1.All City 2.Specific City 3.Ordinal");
		Integer operation = userInput.nextInt();
		
		switch (operation) {
		case 1 ->{
			City[] cities = City.values(); // return array ;
			
			for(final City city:cities) {
				
				System.out.printf("%d - %s ( %d , %d ) %n ", city.ordinal(), city , city.getRank() , city.getPopulation());
			}
		}
		
		case 2 -> {
			
			System.out.print("Enter City Name : ");
			String cityName = userInput.next().toUpperCase();
			City city = City.valueOf(cityName);
			
			System.out.printf("%d - %s ( %d , %d ) %n ", city.ordinal(), city , city.getRank() , city.getPopulation());
		}
		
		
		
		
		
		default ->
		System.out.println("Invalid Data");
		}
		userInput.close();
	}

}
