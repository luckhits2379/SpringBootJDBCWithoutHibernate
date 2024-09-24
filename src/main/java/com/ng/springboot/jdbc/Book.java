package com.ng.springboot.jdbc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class Book {

	private int bookId;
	private String bookName;

}
