package com.info;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.info.entity.Book;
import com.info.exception.BookException;
import com.info.service.BookService;

@SpringBootApplication
public class SpringdataLibrarybookprojectApplication implements CommandLineRunner{
	
	@Autowired
	BookService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringdataLibrarybookprojectApplication.class, args);
	}
	
	
	public void addBookRecord() throws BookException {
		try {
		Book b = new Book(2,"Shiva's Trilogy-II","Amish",LocalDate.of(2012, 9, 30),"Apex Publication",4217640812922L,710);
		service.addBookRecord(b);
		}
		catch (BookException e){
			System.out.println(e.getMessage());
		}
	}
	
	
	public void updateBookRecord() throws BookException {
		try {
		Book b = new Book(3,"Shiva's Trilogy-III","Amish",LocalDate.of(2015, 9, 10),"Apex Publication",4217640812922L,710);
		service.updateBookRecord(b);
		}
		catch(BookException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteBookRecord() throws BookException {
		try{
			service.deleteBookRecord(3);
		}
		catch (BookException e) {
			System.out.println(e.getMessage());
		}
		}
	
	public void getBook() throws BookException {
		try {
			service.getBook(3);
		}
		catch (BookException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void getAllBooks() throws BookException {
		try {
			service.getAllBooks();
		}
		catch (BookException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void findByAuthorName() throws BookException {
		try {
			service.findByAuthorName("Ayush");
		}
		catch(BookException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void findByPriceGreaterThan() throws BookException {
		try {
			service.findByPriceGreaterThan(900);
		}
		catch (BookException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void findByPriceLessThan() throws BookException {
		try {
			service.findByPriceLesserThan(400);
		}
		catch (BookException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void findByPublishedYearBetween() throws BookException {
		try {
			service.findByPublishedYearBetween(LocalDate.of(2016,5,22) , LocalDate.of(2018,3,12));
		}
		catch (BookException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void findByPublishedYearAfter() throws BookException {
		try {
			service.findByPublishedYearAfter(LocalDate.of(2016,1,25));
		}
		catch (BookException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void findByAuthorNameAndPublisher() throws BookException {
		try {
			service.findByAuthorNameAndPublisher("Amish", "Apex");
		}
		catch(BookException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//addBookRecord();
		//updateBookRecord();
		//deleteBookRecord();
		//getBook();
		//getAllBooks();
		//findByAuthorName();
		//findByPriceGreaterThan();
		//findByPriceLessThan();
		//findByPublishedYearBetween();
		//findByPublishedYearAfter();
		//findByAuthorNameAndPublisher();
	}

}
