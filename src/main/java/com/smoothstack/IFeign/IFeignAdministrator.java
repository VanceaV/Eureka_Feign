package com.smoothstack.IFeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.smoothstack.entity.Author;
import com.smoothstack.entity.Book;
import com.smoothstack.entity.BookLoans;
import com.smoothstack.entity.Borrower;
import com.smoothstack.entity.LibraryBranch;
import com.smoothstack.entity.Publisher;

@FeignClient("EurekaAdministrator")
public interface IFeignAdministrator {

	// -----------------------AUTHOR-----------------------------------//

	@GetMapping("/lms/administrator/authors")
	public ResponseEntity<List<Author>> getAllAuthors();

	@PostMapping("/lms/administrator/authors/author")
	public ResponseEntity<Author> addAuthor(@RequestBody Author author);

	@PutMapping("/lms/administrator/authors/author")
	public ResponseEntity<Author> updateAuthor(@RequestBody Author author);

	@DeleteMapping("/lms/administrator/authors/author{authorId}")
	public ResponseEntity<Author> deleteAuthor(@PathVariable long authorId);

	// -----------------------AUTHOR-----------------------------------//

	// -----------------------BOOK-------------------------------------//

	@GetMapping("/lms/administrator/books")
	public ResponseEntity<List<Book>> getAllBooks();

	@PostMapping("/lms/administrator/books/book")
	public ResponseEntity<Book> addBook(@RequestBody Book book);

	@PutMapping("/lms/administrator/books/book")
	public ResponseEntity<Book> updateBook(@RequestBody Book book);

	@DeleteMapping("/lms/administrator/books/book/{bookId}")
	public ResponseEntity<Book> deleteBook(@PathVariable long bookId);

	// -----------------------BOOK-------------------------------------//

	// -----------------------BORROWER-------------------------------------//

	@GetMapping("/lms/administrator/borrowers")
	public ResponseEntity<List<Borrower>> getAllBorrowers();

	@PostMapping("/lms/administrator/borrowers/borrower")
	public ResponseEntity<Borrower> addBorrower(@RequestBody Borrower borrower);

	@PutMapping("/lms/administrator/borrowers/borrower")
	public ResponseEntity<Borrower> updateBorrower(@RequestBody Borrower borrower);

	@DeleteMapping("/lms/administrator/borrowers/borrower{borrowerId}")
	public ResponseEntity<Borrower> deleteBorrower(@PathVariable long borrowerId);

	// -----------------------BORROWER-------------------------------------//

	// -----------------------LIBRARYBRANCH-------------------------------------//

	@GetMapping("/lms/administrator/libraryBranches")
	public ResponseEntity<List<LibraryBranch>> getAllLibraryBranches();

	@PostMapping("/lms/administrator/libraryBranches/libraryBranch")
	public ResponseEntity<LibraryBranch> addLibraryBranch(@RequestBody LibraryBranch libraryBranch);

	@PutMapping("/lms/administrator/libraryBranches/libraryBranch")
	public ResponseEntity<LibraryBranch> updateLibraryBranch(@RequestBody LibraryBranch libraryBranch);

	@DeleteMapping("/lms/administrator/libraryBranches/libraryBranch/{libraryBranchId}")
	public ResponseEntity<LibraryBranch> deleteLibraryBranch(@PathVariable long libraryBranchId);

	// -----------------------LIBRARYBRANCH-------------------------------------//

	// -----------------------PUBLISHER-----------------------------------------//

	@GetMapping("/lms/administrator/publishers")
	public ResponseEntity<List<Publisher>> getAllPublishers();

	@PostMapping("/lms/administrator/publishers/publisher")
	public ResponseEntity<Publisher> addPublisher(@RequestBody Publisher publisher);

	@PutMapping("/lms/administrator/publishers/publisher")
	public ResponseEntity<Publisher> updatePublisher(@RequestBody Publisher publisher);

	@DeleteMapping("/lms/administrator/publishers/publisher{publisherId}")
	public ResponseEntity<Publisher> deletePublisher(@PathVariable long publisherId);

	// -----------------------PUBLISHER-----------------------------------------//

	// -----------------------OVERRIDEDUEDATE-----------------------------------------//

	@PutMapping("lms/administrator/overRideDueDate")
	public ResponseEntity<BookLoans> overRideDueDate(@RequestParam("bookId") long bookId,
			@RequestParam("branchId") long branchId, @RequestParam("cardNo") long cardNo, @RequestParam String newDate);

	// -----------------------OVERRIDEDUEDATE-----------------------------------------//

}
