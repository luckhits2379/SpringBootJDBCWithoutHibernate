package com.ng.springboot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Book findById(int bookId) {

		Book book = jdbcTemplate.queryForObject("select * from book where id = ?", new BookRowMaperImp(), bookId);

		return book;
	}

	public Book save(Book book) {

		String query = "insert into book values (?, ?)";

		int res = jdbcTemplate.update(query, book.getBookId(), book.getBookName());

		if (res > 0) {

			return book;
		}

		return null;
	}

	public void deleteAll() {

		jdbcTemplate.update("delete from book");
	}

}
