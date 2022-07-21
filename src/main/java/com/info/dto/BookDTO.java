package com.info.dto;

import java.time.LocalDate;

public class BookDTO {
	
	Integer bookID;
	String title;
	String authorName;
	LocalDate publishedYear;
	String publisher;
	Long isbn;
	Integer price;
	
	public BookDTO() {
		super();
	}

	public BookDTO(Integer bookID, String title, String authorName, LocalDate publishedYear, String publisher,
			Long isbn, Integer price) {
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
		return "BookDTO [bookID=" + bookID + ", title=" + title + ", authorName=" + authorName + ", publishedYear="
				+ publishedYear + ", publisher=" + publisher + ", isbn=" + isbn + ", price=" + price + "]";
	}
	

}
