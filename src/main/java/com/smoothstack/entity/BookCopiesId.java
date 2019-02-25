package com.smoothstack.entity;

import java.io.Serializable;



public class BookCopiesId implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private Book book;

	
	private LibraryBranch libraryBranch;

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

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		else if (!(obj instanceof BookCopiesId))
			return false;
		else {
			BookCopiesId bookCopiesId = (BookCopiesId) obj;
			return book.getId() == bookCopiesId.book.getId()
					&& libraryBranch.getId() == bookCopiesId.libraryBranch.getId();
		}
	}

	@Override
	public int hashCode() {

		int a = 100;
		int b = 123;

		return (int) (a * book.getId() + b * libraryBranch.getId() + hashCode());

	}

}


