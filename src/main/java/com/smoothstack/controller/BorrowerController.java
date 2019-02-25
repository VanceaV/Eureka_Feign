package com.smoothstack.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.IFeign.IFeignBorrower;
import com.smoothstack.entity.BookLoans;

@RestController
@RequestMapping("/lms/borrower")
public class BorrowerController {

	@Autowired
	private IFeignBorrower iFeignBorrower;

	@PostMapping("/checkOutABook")
	public ResponseEntity<BookLoans> checkOutABook(@RequestParam("bookId") long bookId,
			@RequestParam("branchId") long branchId, @RequestParam("cardNo") long cardNo,
			@RequestParam("dateOut") String dateOut, @RequestParam("dateDue") String dateDue) {
		return iFeignBorrower.checkOutABook(bookId, branchId, cardNo, dateOut, dateDue);
	}

	@DeleteMapping("/returnABook")
	public ResponseEntity<BookLoans> returnABook(@RequestParam("bookId") long bookId,
			@RequestParam("branchId") long branchId, @RequestParam("cardNo") long cardNo) {
		return iFeignBorrower.returnABook(bookId, branchId, cardNo);

	}

}
