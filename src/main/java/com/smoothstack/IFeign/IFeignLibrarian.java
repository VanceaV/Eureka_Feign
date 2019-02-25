package com.smoothstack.IFeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.smoothstack.entity.Book;
import com.smoothstack.entity.LibraryBranch;

@FeignClient("EurekaLibrarian")
public interface IFeignLibrarian {

	// -----------------------LIBRARYBRANCH-------------------------------------//

	@GetMapping("/lms/librarian/libraryBranches")
	public ResponseEntity<List<LibraryBranch>> getAllLibraryBranches();

	@PutMapping("/lms/librarian/libraryBranches/libraryBranch")
	public ResponseEntity<LibraryBranch> updateLibraryBranchDetails(@RequestBody LibraryBranch libraryBranch);
		

	// -----------------------LIBRARYBRANCH-------------------------------------//

	@PutMapping("/lms/librarian/libraryBranches/libraryBranch/updateNumberOfCopies")
	public ResponseEntity<LibraryBranch> updateNumberOfcopies(@RequestParam("numberOfCopies") int numberOfCopies,
			@RequestParam("bookId") long bookId, @RequestParam("branchId") long branchId);

	@GetMapping("/lms/librarian/books")
	public ResponseEntity<List<Book>> getAllBooksWithAtLeastOneCopy(@RequestParam("branchId") long branchId);

}
