package com.smoothstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.IFeign.IFeignLibrarian;
import com.smoothstack.entity.Book;
import com.smoothstack.entity.LibraryBranch;

@RestController
@RequestMapping("/lms/librarian")
public class LibrarianController {

	@Autowired
	private IFeignLibrarian iFeignLibrarian;

	@GetMapping("/libraryBranches")
	public ResponseEntity<List<LibraryBranch>> getAllLibraryBranches() {
		return iFeignLibrarian.getAllLibraryBranches();
	}

	@PutMapping("/libraryBranches/libraryBranch")
	public ResponseEntity<LibraryBranch> updateLibraryBranchDetails(@RequestBody LibraryBranch libraryBranch) {
		return iFeignLibrarian.updateLibraryBranchDetails(libraryBranch);

	}

	@PutMapping("/libraryBranches/libraryBranch/updateNumberOfCopies")
	public ResponseEntity<LibraryBranch> updateNumberOfcopies(@RequestParam("numberOfCopies") int numberOfCopies,
			@RequestParam("bookId") long bookId, @RequestParam("branchId") long branchId) {
		return iFeignLibrarian.updateNumberOfcopies(numberOfCopies, bookId, branchId);
	}

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooksWithAtLeastOneCopy(@RequestParam("branchId") long branchId) {
		return iFeignLibrarian.getAllBooksWithAtLeastOneCopy(branchId);
	}

}
