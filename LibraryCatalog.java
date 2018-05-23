package by.htp.library.entity;

public class LibraryCatalog {
	
	private Book[] books;
	private int lastIndex;

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public LibraryCatalog(int size) {
		
		this.books = new Book [size];
	}
	
	public void addBook (Book book) {
		
		books[lastIndex] = book;
		lastIndex++;
	}

}
