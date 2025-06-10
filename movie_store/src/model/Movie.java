package model;

import java.time.LocalDate;

public class Movie {
	
	private Long id;
	private String title;
	private String genre;
	private Integer durationByMin;
	private Double imdbRating;
	private Double rRating;
	private Boolean rRated;
	private LocalDate releasedDate;
	private String description;
	
	public Movie(){
		
	}

	public Movie(String title, String genre, Integer durationByMin, Double imdbRating, Double rRating, Boolean rRated,
			LocalDate releaseDate, String description) {
		super();
		this.title = title;
		this.genre = genre;
		this.durationByMin = durationByMin;
		this.imdbRating = imdbRating;
		this.rRating = rRating;
		this.rRated = rRated;
		this.releasedDate = releaseDate;
		this.description = description;
	}

	public Movie(Long id, String title, String genre, Integer durationByMin, Double imdbRating, Double rRating,
			Boolean rRated, LocalDate releaseDate, String description) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.durationByMin = durationByMin;
		this.imdbRating = imdbRating;
		this.rRating = rRating;
		this.rRated = rRated;
		this.releasedDate = releaseDate;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getDurationByMin() {
		return durationByMin;
	}

	public void setDurationByMin(Integer durationByMin) {
		this.durationByMin = durationByMin;
	}

	public Double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(Double imdbRating) {
		this.imdbRating = imdbRating;
	}

	public Double getrRating() {
		return rRating;
	}

	public void setrRating(Double rRating) {
		this.rRating = rRating;
	}

	public Boolean getrRated() {
		return rRated;
	}

	public void setrRated(Boolean rRated) {
		this.rRated = rRated;
	}

	public LocalDate getReleaseDate() {
		return releasedDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releasedDate = releaseDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", genre=" + genre + ", durationByMin=" + durationByMin
				+ ", imdbRating=" + imdbRating + ", rRating=" + rRating + ", rRated=" + rRated + ", releaseDate="
				+ releasedDate + ", description=" + description + "]";
	}
	
	
}

