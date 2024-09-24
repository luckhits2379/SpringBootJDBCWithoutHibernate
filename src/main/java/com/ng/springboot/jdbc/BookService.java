package com.ng.springboot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	public Book getBookById(int bookId) {

		return bookRepository.findById(bookId);
	}

	public Book createBook(Book book) {

		return bookRepository.save(book);
	}

	public void deleteAll() {

		bookRepository.deleteAll();
	}

}
