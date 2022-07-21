package com.info.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.dto.BookDTO;
import com.info.entity.Book;
import com.info.exception.BookException;
import com.info.repository.BookRepository;

@Service
public class BookService implements IBookService {
	
	@Autowired
	BookRepository brepo;

	@Override
	public Book addBookRecord(Book b) throws BookException{
		Optional<Book> bk = brepo.findById(b.getBookID());
		if(bk.isPresent()) {
			throw new BookException("Record already exits.");
		}
		else {
			return brepo.save(b);
		}	
		
	}

	@Override
	public Book updateBookRecord(Book b) throws BookException{
		Optional <Book> bk = brepo.findById(b.getBookID());
		if(bk.isPresent()) {
			return brepo.save(b);
		}
		else {
			throw new BookException("Record not found");
		} 
	}

	@Override
	public Book getBook(int id) throws BookException{
		
		Book b = null;
		Optional<Book> bk = brepo.findById(id);
		if(bk.isPresent()) {
			 brepo.findById(id);
			System.out.println(bk);
		}
		else {
			throw new BookException("Record doesn't exits by ID. Invalid ID.");
		
		}
		return b;
	}

	@Override
	public Iterable<Book> getAllBooks() throws BookException{
		List<Book> bal =(List<Book>) brepo.findAll();
		if(bal.isEmpty()) {
			throw new BookException("There are no Records");
		}
		else {
			for(Book b:bal)
				System.out.println(b);
		return bal;
		}
	}

	@Override
	public Book deleteBookRecord(int id) throws BookException{
		
		Optional <Book> bk = brepo.findById(id);
		if(bk.isPresent()) {
			brepo.deleteById(id);
			}
		else {
			throw new BookException("Record doesn't exits by ID. Invalid ID.");
		}
		return null;
		}

	@Override
	public List<Book> findByAuthorName(String name) throws BookException {
		List<Book> al = brepo.getByAuthorName(name);
		if(al.isEmpty()) {
			throw new BookException("There is No Book present by that Author.");
		}
		else {
			for (Book b:al) 
				System.out.println(b);
		return al;
		}
			
	}

	@Override
	public List<Book> findByPriceGreaterThan(int cost) throws BookException{
		List<Book> al = brepo.getByPriceGreaterThan(cost);
		if(al.isEmpty()) {
			throw new BookException("There is no Book with price greater than specified.");
		}
		else {
			for (Book b:al) 
				System.out.println(b);
			return al;	
		}
		
	}

	@Override
	public List<Book> findByPriceLesserThan(int cost) throws BookException {
		List<Book> al = brepo.getByPriceLessThan(cost);
		if(al.isEmpty()) {
			throw new BookException("There is no Book with price less than specified.");
		}
		else {
			for (Book b:al)
				System.out.println(b);
		return al;	
		}
		
	}

	@Override
	public List<Book> findByPublishedYearBetween(LocalDate fromdate, LocalDate todate) throws BookException {
		List<Book> al = brepo.getByPublishedYearBetween(fromdate, todate);
		if(al.isEmpty()) {
			throw new BookException("No Book released between the specified date range.");
		}
		else {
			for (Book b:al)
				System.out.println(b);
		return al;	
		}
	}

	@Override
	public List<Book> findByPublishedYearAfter(LocalDate date) throws BookException {
		List<Book> al = brepo.getByPublishedYearAfter(date);
		if(al.isEmpty()) {
			throw new BookException("No Book released after the specified year.");
		}
		else {
			for (Book b:al)
				System.out.println(b);
		return al;	
		}
	}

	@Override
	public List<Book> findByAuthorNameAndPublisher(String aname, String pname) throws BookException {
		List<Book> al = brepo.getByAuthorNameAndPublisher(aname, pname);
		if(al.isEmpty()) {
			throw new BookException("No Book by specified Author and Publisher.");
		}
		else {
			for(Book b:al)
				System.out.println(b);
		return al;	
		}
	}
	
	

}
