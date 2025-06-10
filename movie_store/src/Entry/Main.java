package Entry;

import java.util.Scanner;

import View.MovieView;

public class Main {
	
	private final static MovieView movieView = new MovieView();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("--- Movie Store ---");
		
		Operate(userInput);
	}
	
	private static void Operate(Scanner userInput) {
		
		while(true) {
			System.out.println("1.list 2.search 3.create 4.update 5.delete");
			int operation = userInput.nextInt();
			
			switch(operation) {
			case 1 -> movieView.movieList();
			case 2 -> {
				System.out.println("1.Id 2.Title");
				int searchOpt = userInput.nextInt();
				switch (searchOpt) {
				case 1 ->  movieView.getMovieById(userInput);
				case 2 -> movieView.showTitleSearchResult(userInput);
				default -> 
					throw new IllegalArgumentException("Unexpected value: ");
				}
			}
			case 3-> movieView.showCreateResult(userInput);
			case 4 -> movieView.showUpdateResult(userInput);
			case 5-> movieView.deleteMovie(userInput);
			
			default ->
			throw new IllegalArgumentException("Error");
			}
			
			System.out.println("Do you want to close app");
			char choice = userInput.next().charAt(0);
			if(choice == 'y') {
				userInput.close();
				break;
			}
				
		}
	}

}
