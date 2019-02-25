package com.smoothstack.entity;

import java.time.LocalDate;





public class BookLoans {

	
	private BookLoansId id;


	private LocalDate dateOut;

	
	private LocalDate dueDate;


	public Book getBook() {
		return id.getBook();
	}

	public void setBook(Book book) {
		id.setBook(book);
	}


	public LibraryBranch getLibraryBranch() {
		return id.getLibraryBranch();
	}

	public void setLibraryBranch(LibraryBranch libraryBranch) {
		id.setLibraryBranch(libraryBranch);
		
	}

	
	public Borrower getBorrower() {
		return id.getBorrower();
	}

	public void setBorrower(Borrower borrower) {
		id.setBorrower(borrower);
	}

	public BookLoansId getId() {
		return id;
	}
	

	public void setId(BookLoansId id) {
		this.id = id;
	}

	public LocalDate getDateOut() {
		return dateOut;
	}

	public void setDateOut(LocalDate dateOut) {
		this.dateOut = dateOut;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

}

