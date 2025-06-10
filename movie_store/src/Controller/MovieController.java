package Controller;

import java.util.List;

import model.Movie;
import model.MovieDAO;

public class MovieController {
	private final MovieDAO movieDAO = new MovieDAO();
	
	
    public String updateMovie(Movie movie) {
		
		if(movie.getId() == null) {
			return "Update Movie id is null";
		}
		
		return movieDAO.updateMovie(movie) ? "Movie Updated Successfully" : "Update Operation Fail";
		
	}
	
	public List<Movie> getAllMovie() {
	  List<Movie> movieList=movieDAO.getAllMovie();
	  return movieList;
	}
	
	public List<Movie> searchMovieByTitle(String charSeq){
		return movieDAO.getAllMovie().stream()
			.filter(m -> m.getTitle().toLowerCase().contains(charSeq)).toList();
	}
	
	public String deleteMovie(Long movieId) {
		return  movieDAO.deleteMovie(movieId) ? "movie Id = "+ movieId+ " is deleted " : " Process fail to delete";
	}
    public String createMovie(Movie movie) {
		
		return movieDAO.insertMovie(movie) ? "movie is created " : " movie creation is fail";
	}
    
    public Movie getMovieById(Long movieId) {
		return movieDAO.getMovieById(movieId);
}
}
