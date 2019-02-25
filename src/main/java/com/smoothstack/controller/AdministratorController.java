package com.smoothstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.IFeign.IFeignAdministrator;
import com.smoothstack.entity.Author;
import com.smoothstack.entity.Book;
import com.smoothstack.entity.BookLoans;
import com.smoothstack.entity.Borrower;
import com.smoothstack.entity.LibraryBranch;
import com.smoothstack.entity.Publisher;

@RestController
@RequestMapping("/lms/administrator")
public class AdministratorController {

	@Autowired
	private IFeignAdministrator iFeignAdministrator;

	// -----------------------AUTHOR-----------------------------------//

	@GetMapping("/authors")
	public ResponseEntity<List<Author>> getAllAuthors() {
		return iFeignAdministrator.getAllAuthors();
	}

	@PostMapping("/authors/author")
	public ResponseEntity<Author> addAuthor(@RequestBody Author author) {
		return iFeignAdministrator.addAuthor(author);
	}

	@PutMapping("/authors/author")
	public ResponseEntity<Author> updateAuthor(@RequestBody Author author) {
		return iFeignAdministrator.updateAuthor(author);

	}

	@DeleteMapping("/authors/author{authorId}")
	public ResponseEntity<Author> deleteAuthor(@PathVariable long authorId) {
		return iFeignAdministrator.deleteAuthor(authorId);
	}

	// -----------------------AUTHOR-----------------------------------//

	// -----------------------BOOK-----------------------------------//

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() {
		return iFeignAdministrator.getAllBooks();
	}

	@PostMapping("/books/book")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		return iFeignAdministrator.addBook(book);
	}

	@PutMapping("/books/book")
	public ResponseEntity<Book> updateBook(@RequestBody Book book) {
		return iFeignAdministrator.updateBook(book);
	}

	@DeleteMapping("/books/book/{bookId}")
	public ResponseEntity<Book> deleteBook(@PathVariable long bookId) {
		return iFeignAdministrator.deleteBook(bookId);
	}

	// -----------------------BOOK-----------------------------------//

	// -----------------------BORROWER-----------------------------------//

	@GetMapping("/borrowers")
	public ResponseEntity<List<Borrower>> getAllBorrowers() {
		return iFeignAdministrator.getAllBorrowers();
	}

	@PostMapping("/borrowers/borrower")
	public ResponseEntity<Borrower> addBorrower(@RequestBody Borrower borrower) {
		return iFeignAdministrator.addBorrower(borrower);
	}

	@PutMapping("/borrowers/borrower")
	public ResponseEntity<Borrower> updateBorrower(@RequestBody Borrower borrower) {
		return iFeignAdministrator.updateBorrower(borrower);
	}

	@DeleteMapping("/borrowers/borrower{borrowerId}")
	public ResponseEntity<Borrower> deleteBorrower(@PathVariable long borrowerId) {
		return iFeignAdministrator.deleteBorrower(borrowerId);
	}

	// -----------------------BORROWER-----------------------------------//

	// -----------------------LIBRARYBRANCH-----------------------------------//

	@GetMapping("/libraryBranches")
	public ResponseEntity<List<LibraryBranch>> getAllLibraryBranches() {
		return iFeignAdministrator.getAllLibraryBranches();
	}

	@PostMapping("/libraryBranches/libraryBranch")
	public ResponseEntity<LibraryBranch> addLibraryBranch(@RequestBody LibraryBranch libraryBranch) {
		return iFeignAdministrator.addLibraryBranch(libraryBranch);
	}

	@PutMapping("/libraryBranches/libraryBranch")
	public ResponseEntity<LibraryBranch> updateLibraryBranch(@RequestBody LibraryBranch libraryBranch) {
		return iFeignAdministrator.updateLibraryBranch(libraryBranch);
	}

	@DeleteMapping("/libraryBranches/libraryBranch/{libraryBranchId}")
	public ResponseEntity<LibraryBranch> deleteLibraryBranch(@PathVariable long libraryBranchId) {
		return iFeignAdministrator.deleteLibraryBranch(libraryBranchId);
	}

	// -----------------------LIBRARYBRANCH-----------------------------------//

	// -----------------------PUBLISHER---------------------------------------//

	@GetMapping("/publishers")
	public ResponseEntity<List<Publisher>> getAllPublishers() {
		return iFeignAdministrator.getAllPublishers();
	}

	@PostMapping("/publishers/publisher")
	public ResponseEntity<Publisher> addPublisher(@RequestBody Publisher publisher) {
		return iFeignAdministrator.addPublisher(publisher);
	}

	@PutMapping("/publishers/publisher")
	public ResponseEntity<Publisher> updatePublisher(@RequestBody Publisher publisher) {
		return iFeignAdministrator.updatePublisher(publisher);
	}

	@DeleteMapping("/publishers/publisher{publisherId}")
	public ResponseEntity<Publisher> deletePublisher(@PathVariable long publisherId) {
		return iFeignAdministrator.deletePublisher(publisherId);
	}

	// -----------------------PUBLISHER---------------------------------------//

	// -----------------------OVERRIDEDUEDATE-----------------------------------------//

	@PutMapping("/overRideDueDate")
	public ResponseEntity<BookLoans> overRideDueDate(@RequestParam("bookId") long bookId,
			@RequestParam("branchId") long branchId, @RequestParam("cardNo") long cardNo,
			@RequestParam String newDate) {
		return iFeignAdministrator.overRideDueDate(bookId, branchId, cardNo, newDate);
	}

	// -----------------------OVERRIDEDUEDATE-----------------------------------------//

}
