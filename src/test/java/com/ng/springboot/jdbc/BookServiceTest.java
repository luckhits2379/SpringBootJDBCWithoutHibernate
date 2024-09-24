package com.ng.springboot.jdbc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class BookServiceTest {

	@Autowired
	BookService bookService;

	@BeforeAll
	void deleteAll() {

		bookService.deleteAll();

	}

	@Test
	void testGetBookById() {

		Book book = new Book(1, "book1");

		Book createdBook = bookService.createBook(book);

		Assertions.assertThat(createdBook).isNotNull();
		Assertions.assertThat(createdBook.getBookId()).isEqualTo(1);
		Assertions.assertThat(createdBook.getBookName()).isEqualTo("book1");

		Book retrivedBook = bookService.getBookById(1);
		Assertions.assertThat(retrivedBook).isNotNull();
		Assertions.assertThat(retrivedBook.getBookId()).isEqualTo(1);
		Assertions.assertThat(retrivedBook.getBookName()).isEqualTo("book1");

	}

	@Test
	void testCreateBook() {

		Book book = new Book(2, "book2");

		Book createdBook = bookService.createBook(book);

		Assertions.assertThat(createdBook).isNotNull();
		Assertions.assertThat(createdBook.getBookId()).isEqualTo(2);
		Assertions.assertThat(createdBook.getBookName()).isEqualTo("book2");

	}

}
