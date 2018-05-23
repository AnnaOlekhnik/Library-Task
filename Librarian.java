package by.htp.library.logic;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.entity.LibraryCatalog;

public class Librarian {

	public void printCatalog(LibraryCatalog catalog) {

		for (Book books : catalog.getBooks()) {
			if (books.getAuthor1() == null) {
				System.out.println(books.getTitle() + " " + books.getYear() + " " + books.getAuthor().getName() + " "
						+ books.getAuthor().getSecondName() + " " + books.getAuthor().getBirthYear());
			}
			if (books.getAuthor1() != null) {

				System.out.println(books.getTitle() + " " + books.getYear() + " " + books.getAuthor().getName() + " "
						+ books.getAuthor().getSecondName() + " " + books.getAuthor().getBirthYear() + " "
						+ books.getAuthor1().getName() + " " + books.getAuthor1().getSecondName() + " "
						+ books.getAuthor1().getBirthYear());

			}
		}
		System.out.println("--------------------");

	}

	public void printOneBook(Book book) {

		System.out.println(book.getTitle() + " " + book.getYear() + " " + book.getAuthor().getName() + " "
				+ book.getAuthor().getSecondName() + " " + book.getAuthor().getBirthYear());

		System.out.println("--------------------");

	}

	public int listSizeCounter(LibraryCatalog catalog, Author author) {

		int count = 0;
		for (Book books : catalog.getBooks()) {
			if (books.getAuthor1() == null) {
				if (books.getAuthor().getName().equals(author.getName())) {
					count++;
				}
			}
			if (books.getAuthor1() != null) {
				if (books.getAuthor().getName().equals(author.getName())
						|| books.getAuthor1().getName().equals(author.getName())) {
					count++;
				}
			}
		}
		return count;

	}

	public Book[] selectBookByAuthor(LibraryCatalog catalog, Author author) {

		int iBook = 0;
		int count = listSizeCounter(catalog, author);
		Book[] books1 = new Book[count];
		for (Book books : catalog.getBooks()) {
			if (books.getAuthor1() == null) {
				if (books.getAuthor().getName().equals(author.getName())) {

					books1[iBook] = books;
					iBook++;
				}
			}
			if (books.getAuthor1() != null) {
				if (books.getAuthor().getName().equals(author.getName())
						|| books.getAuthor1().getName().equals(author.getName())) {
					books1[iBook] = books;
					iBook++;
				}
			}

		}
		return books1;

	}

	public void printBooks(Book[] books) {

		for (Book book : books) {
			if (book.getAuthor1() == null) {
				System.out.println(book.getTitle() + " " + book.getYear() + " " + book.getAuthor().getName() + " "
						+ book.getAuthor().getSecondName() + " " + book.getAuthor().getBirthYear());
			}
			if (book.getAuthor1() != null) {

				System.out.println(book.getTitle() + " " + book.getYear() + " " + book.getAuthor().getName() + " "
						+ book.getAuthor().getSecondName() + " " + book.getAuthor().getBirthYear() + " "
						+ book.getAuthor1().getName() + " " + book.getAuthor1().getSecondName() + " "
						+ book.getAuthor1().getBirthYear());

			}
		}
		System.out.println("--------------------");

	}

	public Book[] selectBookByTitle(LibraryCatalog catalog, Author author, String title, int Year) {

		int iBook = 0;
		int count = 0;
		for (Book books : catalog.getBooks()) {
			if (books.getAuthor().getName().equals(author.getName()) && books.getTitle().equals(title)
					&& books.getYear() == Year) {
				count++;
			}
		}

		Book[] books2 = new Book[count];
		for (Book books : catalog.getBooks()) {
			if (books.getAuthor().getName().equals(author.getName()) && books.getTitle().equals(title)
					&& books.getYear() == Year) {

				books2[iBook] = books;
				iBook++;
			}
		}
		return books2;
	}
}
