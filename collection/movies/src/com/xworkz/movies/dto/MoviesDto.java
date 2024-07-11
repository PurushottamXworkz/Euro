package com.xworkz.movies.dto;

public class MoviesDto {

	private String movieName;
	private int releaseYear;
	private String castName;
	
	
	public MoviesDto(String movieName, int releaseYear, String castName) {
		super();
		this.movieName = movieName;
		this.releaseYear = releaseYear;
		this.castName = castName;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getCastName() {
		return castName;
	}
	public void setCastName(String castName) {
		this.castName = castName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((castName == null) ? 0 : castName.hashCode());
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + releaseYear;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoviesDto other = (MoviesDto) obj;
		if (castName == null) {
			if (other.castName != null)
				return false;
		} else if (!castName.equals(other.castName))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (releaseYear != other.releaseYear)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MoviesDto [movieName=" + movieName + ", releaseYear=" + releaseYear + ", castName=" + castName + "]";
	}
	
	
}
