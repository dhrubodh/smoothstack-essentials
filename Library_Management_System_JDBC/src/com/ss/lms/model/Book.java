/**
 * 
 */
package com.ss.lms.model;

import java.util.Objects;

/**
 * @author dhrubo
 *
 */
public class Book {
	
	private Integer bookId;
	private String title;
	private Publisher publisher;
	
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookId, other.bookId);
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + "]";
	}
	

}
