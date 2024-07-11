package com.xworkz.books.dto;

public class BooksDto {
	private String bookName;
	private String author;
	private int noOfbooks;
	
	
	
	public BooksDto(String bookName, String author, int noOfbooks) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.noOfbooks = noOfbooks;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getNoOfbooks() {
		return noOfbooks;
	}
	public void setNoOfbooks(int noOfbooks) {
		this.noOfbooks = noOfbooks;
	}

	@Override
	public String toString() {
		return "BooksDto [bookName=" + bookName + ", author=" + author + ", noOfbooks=" + noOfbooks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + noOfbooks;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BooksDto other = (BooksDto) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (noOfbooks != other.noOfbooks)
			return false;
		return true;
	}
	
	
	
	
}
