package com.smoothstack.entity;




public class BookCopies {


	private BookCopiesId id;


	private int noOfCopies;

	public BookCopiesId getId() {
		return id;
	}

	public void setId(BookCopiesId id) {
		this.id = id;
	}


	public Book getBook() {
		return id.getBook();
	}

	public void setBook(Book book) {
		this.id.setBook(book);
	}


	public LibraryBranch getLibraryBranch() {
		return id.getLibraryBranch();
	}

	public void setLibraryBranch(LibraryBranch libraryBranch) {
		this.id.setLibraryBranch(libraryBranch);
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void decrementNumberOfCopies() {
		if (noOfCopies > 0)
			noOfCopies--;
	}

	public void incrementNumberOfCopies() {
		noOfCopies++;
	}

}
