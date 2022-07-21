package com.info.service;

import java.time.LocalDate;
import java.util.List;

import com.info.dto.BookDTO;
import com.info.entity.Book;
import com.info.exception.BookException;

public interface IBookService {
	
	public Book addBookRecord(Book b) throws BookException;
	public Book updateBookRecord(Book b) throws BookException;
	public Book getBook(int id) throws BookException;
	public Iterable <Book> getAllBooks() throws BookException;
	public Book deleteBookRecord(int id) throws BookException;
	public List<Book> findByAuthorName(String name) throws BookException;
	public List<Book> findByPriceGreaterThan(int cost)throws BookException;
	public List<Book> findByPriceLesserThan(int cost)throws BookException;
	public List<Book> findByPublishedYearBetween(LocalDate fromdate, LocalDate todate) throws BookException;
	public  List<Book> findByPublishedYearAfter(LocalDate date) throws BookException;
	public List<Book> findByAuthorNameAndPublisher(String aname, String pname) throws BookException;
}
