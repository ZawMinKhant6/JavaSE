package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import database.DBConnection;

public class MovieDAO {
	
	private Connection connection;
	private Statement stmt;
	private PreparedStatement pStmt;
	private ResultSet rs;
	
	//Read R
	
	private void closeConnection() {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public List<Movie> getAllMovie(){
		List<Movie> movieList = new ArrayList<Movie>();
		connection = DBConnection.getConnection();
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("SELECT * FROM movie");
			
			while(rs.next()) {
				movieList.add(new Movie(
					rs.getLong("id"),
					rs.getString("title"),
					rs.getString("genre"),
					rs.getInt("durationByMin"),
					rs.getDouble("imdbRating"),
					rs.getDouble("rtRating"),
					rs.getBoolean("rRated"),
					rs.getDate("releasedDate").toLocalDate(),
					rs.getString("description")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
		return movieList;
		
	}
	
	
	//search ID;
		public Movie getMovieById(Long movieId){
			
			    Movie movie = null;
				connection = DBConnection.getConnection();
				try {
					stmt = connection.createStatement();
					rs = stmt.executeQuery("SELECT * FROM movie where id = '"+ movieId+"' ;"); // DQL Query;
					
					while(rs.next()) {
						movie = new Movie(
								rs.getLong("id"),
								rs.getString("title"),
								rs.getString("genre"),
								rs.getInt("durationByMin"),
								rs.getDouble("imdbRating"),
								rs.getDouble("rtRating"),
								rs.getBoolean("rRated"),
								rs.getDate("releasedDate").toLocalDate(),
								rs.getString("description")
								);
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					closeConnection();
				}
				
				return movie;
		}

	
	
	public boolean deleteMovie(Long movieId) {
		Boolean deleteOk=false;
		connection =DBConnection.getConnection();
		
		try {
			pStmt=connection.prepareStatement("Delete From movie where id = ? ");
			pStmt.setLong(1, movieId);
			
			int rowEffected = pStmt.executeUpdate();
			if(rowEffected > 0) {
				deleteOk = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deleteOk;
	}
	public boolean insertMovie(Movie movie ) {
		
	     boolean insertOk = false;
		 connection = DBConnection.getConnection();
		 
		 try {
			 pStmt= connection.prepareStatement("insert into movie (title,genre,durationByMin,imdbRating,rtRating,rRated,releasedDate,description) VALUES (?,?,?,?,?,?,?,?);");
				pStmt.setString(1, movie.getTitle());
				pStmt.setString(2, movie.getGenre());
				pStmt.setInt(3, movie.getDurationByMin());
				pStmt.setDouble(4, movie.getImdbRating());
				pStmt.setDouble(5, movie.getrRating());
				pStmt.setBoolean(6, movie.getrRated());
				pStmt.setDate(7, Date.valueOf(movie.getReleaseDate()));
				pStmt.setString(8, movie.getDescription());
				
				int rowEffected = pStmt.executeUpdate();
			if(rowEffected > 0) {
				insertOk = true;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			closeConnection();
		}
		 
		 return insertOk;
		 
	}
	
	//bad practice
//	public boolean insertMovie(Movie movie ) {
//		
//	     boolean insertOk = false;
//		 connection = DBConnection.getConnection();
//		 
//		 try {
//			stmt = connection.createStatement();
//			int rowEffected = stmt.executeUpdate("INSERT INTO movie "
//					+ "(title,genre,durationByMin,imdbRating,rtRating,rRated,releasedDate,description)"
//					+ "VALUES ('"
//					+movie.getTitle()+"','"
//					+movie.getGenre()+"','"
//					+movie.getDurationByMin()+"','"
//					+movie.getImdbRating()+"','"
//					+movie.getrRating()+"','"
//					+(movie.getrRated() ? 1 : 0)+"','"
//					+movie.getReleaseDate()+"','"
//					+movie.getDescription()
//					+"')");
//			if(rowEffected > 0) {
//				insertOk = true;
//			}
//		
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			closeConnection();
//		}
//		 
//		 return insertOk;
//		 
//	}
//	
}
