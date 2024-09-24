package com.ng.springboot.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookRowMaperImp implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {

		Book book = new Book();

		book.setBookId(rs.getInt("id"));
		book.setBookName(rs.getString("name"));

		return book;
	}

}
