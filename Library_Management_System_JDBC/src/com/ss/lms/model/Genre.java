/**
 * 
 */
package com.ss.lms.model;

import java.util.Objects;

/**
 * @author dhrubo
 *
 */
public class Genre {
	
	private Integer genreId;
	private String genreName;
	
	
	public Integer getGenreId() {
		return genreId;
	}
	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(genreId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genre other = (Genre) obj;
		return Objects.equals(genreId, other.genreId);
	}
	
	@Override
	public String toString() {
		return "Genre [genreId=" + genreId + ", genreName=" + genreName + "]";
	}
	

}
