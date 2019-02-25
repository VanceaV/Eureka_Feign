package com.smoothstack.IFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smoothstack.entity.BookLoans;

@FeignClient("EurekaBorrower")
public interface IFeignBorrower {

	@PostMapping("/lms/borrower/checkOutABook")
	public ResponseEntity<BookLoans> checkOutABook(@RequestParam("bookId") long bookId,
			@RequestParam("branchId") long branchId, @RequestParam("cardNo") long cardNo,
			@RequestParam("dateOut") String dateOut, @RequestParam("dateDue") String dateDue);

	@DeleteMapping("/lms/borrower/returnABook")
	public ResponseEntity<BookLoans> returnABook(@RequestParam("bookId") long bookId,
			@RequestParam("branchId") long branchId, @RequestParam("cardNo") long cardNo);

}
