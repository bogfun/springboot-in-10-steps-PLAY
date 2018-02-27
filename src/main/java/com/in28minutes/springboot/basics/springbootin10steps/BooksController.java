package com.in28minutes.springboot.basics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		List<Book> books = Arrays.asList(new Book(1l, "This is it !!!", "Michael Jackson"), new Book(2l, "Zoukdan !!!", "Bogdan Chicos"));
		return books;
	}

}
