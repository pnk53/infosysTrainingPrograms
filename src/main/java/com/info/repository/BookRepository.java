package com.info.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.info.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{
	
	 List<Book> getByAuthorName(String name);
	 List<Book> getByPriceGreaterThan(int cost);
	 List<Book> getByPriceLessThan(int cost);
	 List<Book> getByPublishedYearBetween(LocalDate fromdate, LocalDate todate);
	 List<Book> getByPublishedYearAfter(LocalDate date);
	 List<Book> getByAuthorNameAndPublisher(String aname, String pname);

}
