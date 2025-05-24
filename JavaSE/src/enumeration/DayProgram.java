package enumeration;

import java.util.Scanner;

@SuppressWarnings("unused")
public class DayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek dayofweek= DayOfWeek.SUNDAY;
		
		switch (dayofweek) {
		case MONDAY -> System.out.println(" Hello monday ");
		case TUESDAY -> System.out.println(" hello tuesday ");
		case WEDNESDAY -> System.out.println("hello wednesday ");
		case THURSDAY -> System.out.println(" hello thursday ");
		case FRIDAY -> System.out.println(" hello friday ");
		case SATURDAY -> System.out.println(" hello saturday ");
		case SUNDAY -> System.out.println(" hello sunday ");
		
		default ->
		System.out.println("Invalid Data");
		}
	}

}
