package by.htp.library.entity;

public class Book {

	private int year;
	private String title;
	private Author author;
	private Author author1;

	public Book() {

	}

	public Book(String title, int year, Author author, Author author1) {
		this.title = title;
		this.year = year;
		this.author = author;
		this.author1 = author1;
	}
	
	public Book(String title, int year, Author author) {
		this.title = title;
		this.year = year;
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author getAuthor1() {
		return author1;
	}

	public void setAuthor1(Author author1) {
		this.author1 = author1;
	}

}
