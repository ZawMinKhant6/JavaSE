package View;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Controller.MovieController;
import model.Movie;

public class MovieView {
	
	private final MovieController  movieController = new MovieController();
	
	
	public void showUpdateResult(Scanner userInput) {
		System.out.println("Enter The movie Id You wanted to update");
		Long movieId = userInput.nextLong();
		Movie updatedMovie = movieController.getMovieById(movieId);
		System.out.println("Updated Movie Data");
		showMovieData(updatedMovie);
		
		while(true) {
			System.out.println("1.title 2.genre 3.durationByMins 4.imdbRating 5.rtRating 6.rRated 7.releasedDate 8.description");
			int operation = userInput.nextInt();
			
			switch (operation) {
			case 1 ->{
				System.out.println("Title : ");
				userInput.nextLine();
				updatedMovie.setTitle(userInput.nextLine());
			}
			
			case 2 ->{
				System.out.println("Genre : ");
				userInput.nextLine();
				updatedMovie.setGenre(userInput.nextLine());
			}
			
			case 3 -> {
				System.out.println("Duration By Min : ");
				updatedMovie.setDurationByMin(userInput.nextInt());
			}
			
			case 4 ->{
				System.out.println("imdb Rating : ");
				updatedMovie.setImdbRating(userInput.nextDouble());
			}
			
			case 5 -> {
				System.out.println("Rotten Tomatoes : ");
				
				updatedMovie.setrRating(userInput.nextDouble());
				
			}
			
			case 6 ->{
				System.out.println("rRated : yes - y or no - n ");
				updatedMovie.setrRated(userInput.next().charAt(0) == 'y' );
				userInput.nextLine();
			}
			
			case 7 ->{
				System.out.println("Released Date : yyyy-MM-dd ");
				updatedMovie.setReleaseDate(LocalDate.parse(userInput.next()));
				userInput.nextLine();
			}
			
			case 8 -> {
				System.out.println("description : ");
				userInput.nextLine();
				updatedMovie.setDescription(userInput.nextLine());
			}
			
			default ->
			throw new IllegalArgumentException("Unexpected value: " + operation);
			}
			
			System.out.println("Continue Update ? yes-y or no-n");
			char decision = userInput.next().charAt(0);
			
			if(decision == 'n') {
				
				break;
			}
		}
		
		System.out.println("### Movie Update Result ###");
		System.out.println(movieController.updateMovie(updatedMovie));
		
		
	}

	
	public void listMovie(List<Movie> movieList) {
			
			
			if(!movieList.isEmpty()) {
				System.out.println("All Movie Data : " );
				System.out.println();
				
				for(final Movie movie:movieList) {
					
					showMovieData(movie);
					System.out.println();
				
				}
				
				
			
			}
			else {
				System.out.println("No movies is found");
			}
		}
	
private void showMovieData(Movie movie) {
	
	
		
		if(movie != null) {
			System.out.println(" Movie Id " +movie.getId() +" ###");
			System.out.println("Movie Title : " + movie.getTitle());
			System.out.println("Movie Genre : " + movie.getGenre());
			System.out.println("Movie Duration: " + movie.getDurationByMin());
			System.out.println("Movie imdbRating : " + movie.getImdbRating());
			System.out.println("Movie rtRating : " + movie.getrRating());
			System.out.println("Movie R Rated ?  : " + (movie.getrRated() ? "yes" : "no"));
			System.out.println("Movie Releaded Date : " + movie.getReleaseDate());
			System.out.println("Movie Description : " );
			System.out.println( movie.getDescription());
			System.out.println();
		}
		else {
			System.out.println("There is no such movie with this movieId ");
		}
	}
	public void deleteMovie(Scanner userInput) {
		System.out.println("Enter movie id you want to delete");
		Long movieId = userInput.nextLong();
		System.out.println("### Movie Delete Result ###");
		System.out.println(movieController.deleteMovie(movieId));
	}
	
	public void getMovieById(Scanner userInput) {
		System.out.println("Enter movie id you want to Search : ");
		Long movieId = userInput.nextLong();
		Movie movie =movieController.getMovieById(movieId);
		System.out.println("### Movie Search Result ###");
		showMovieData(movie);
	}
	
	public void showTitleSearchResult(Scanner userInput) {
		System.out.println("Enter Searched text :");
		userInput.nextLine();
		String charSqp = userInput.nextLine().toLowerCase();
		System.out.println("Search Result : ");
		listMovie(movieController.searchMovieByTitle(charSqp));
	}
	
    public void showCreateResult(Scanner userInput) {
    	System.out.println("Title : ");
		userInput.nextLine();
		String title = userInput.nextLine();
		System.out.println("Genre : ");
		String genre = userInput.nextLine();
		System.out.println("DurationByMin : ");
		Integer durationByMin = userInput.nextInt();
		System.out.println("imdb Rating : ");
		Double imdbRating = userInput.nextDouble();
		System.out.println("Rotten Tomato Rating :");
		Double rottenTomato = userInput.nextDouble();
		System.out.println("rRated : yes -  y or no - n ");
		Boolean rRated = userInput.next().charAt(0) == 'y' ;
		System.out.println("ReleasedDate: yyyy-MM-dd");
		LocalDate releasedDate = LocalDate.parse(userInput.next());
		System.out.println("Description: ");
		userInput.nextLine();
		String description = userInput.nextLine();
		Movie movie = new Movie(title,genre,durationByMin,imdbRating,rottenTomato,rRated,releasedDate,description);
		String message  = movieController.createMovie(movie);
		System.out.println("Movie creation result");
		System.out.println(message);
	}
	
	 public void movieList() {
		List<Movie> movieList = movieController.getAllMovie();
		
		if(!movieList.isEmpty()) {
			System.out.println("All Movie Data : ");
			System.out.println();
			movieList.forEach((n) -> {;
				System.out.println("### Movie Id ### - " + n.getId());
				System.out.println("### Movie Title ### - " + n.getTitle());
				System.out.println("### Movie Genre ### - " + n.getGenre());
				System.out.println("### Movie DurationByMin ### - " + n.getDurationByMin());
				System.out.println("### Movie imdbRating ### - " + n.getImdbRating());
				System.out.println("### Movie rRating ### - " + n.getrRating());
				System.out.println("### Movie rRated ### - " + ( n.getrRated() ?  "Yes":"No"));
				System.out.println("### Movie ReleaseDate ### - " + n.getReleaseDate());
				System.out.println("--- This is Movie Description ---");
				System.out.println(n.getDescription());
				System.out.println();
				
			});
		}
	}
}
