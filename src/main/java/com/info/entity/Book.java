package com.info.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_tbl")
public class Book {
	
	@Id
	@Column(name="bID")
	Integer bookID;
	
	@Column(name="bTitle", length=20)
	String title;
	
	@Column(name="aName", length=20)
	String authorName;
	
	@Column(name="bYear")
	LocalDate publishedYear;
	
	@Column(name="bPublisher", length=20)
	String publisher;
	
	@Column(name="bIsbn")
	Long isbn;
	
	@Column(name="bPrice")
	Integer price;
	
	public Book() {
		super();
	}

	public Book(Integer bookID, String title, String authorName, LocalDate publishedYear, String publisher, Long isbn,
			Integer price) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.authorName = authorName;
		this.publishedYear = publishedYear;
		this.publisher = publisher;
		this.isbn = isbn;
		this.price = price;
	}

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public LocalDate getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(LocalDate publishedYear) {
		this.publishedYear = publishedYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", authorName=" + authorName + ", publishedYear="
				+ publishedYear + ", publisher=" + publisher + ", isbn=" + isbn + ", price=" + price + "]";
	}

}
