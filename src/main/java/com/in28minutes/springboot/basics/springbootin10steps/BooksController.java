package com.in28minutes.springboot.basics.springbootin10steps;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		List<Object> asList = Arrays.asList(new Book(1l, "This is it !!!", "Michael Jackson"));
		List<Book> books = new ArrayList<>();
		for(Object elem : asList) {
			books.add((Book) elem);
		}
		return books;
	}

}
