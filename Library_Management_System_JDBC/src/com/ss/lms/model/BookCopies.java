/**
 * 
 */
package com.ss.lms.model;

/**
 * @author dhrubo
 *
 */
public class BookCopies {
	
	private Integer noOfCopies;
	private Book book;
	private LibraryBranch libraryBranch;
	
	
	public Integer getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(Integer noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public LibraryBranch getLibraryBranch() {
		return libraryBranch;
	}
	public void setLibraryBranch(LibraryBranch libraryBranch) {
		this.libraryBranch = libraryBranch;
	}
	

}
