/**
 * 
 */
package com.ss.lms.model;

/**
 * @author dhrubo
 *
 */
public class BookLoans {
	
	private String dateOut;
	private String dueDate;
	private String dateIn;
	
	private Book book;
	private LibraryBranch libraryBranch;
	private Borrower borrower;
	
	
	public String getDateOut() {
		return dateOut;
	}
	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getDateIn() {
		return dateIn;
	}
	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
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
	public Borrower getBorrower() {
		return borrower;
	}
	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
	

}
