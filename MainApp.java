package by.htp.library.run;

import by.htp.library.entity.Author;
import by.htp.library.entity.Book;
import by.htp.library.entity.LibraryCatalog;
import by.htp.library.logic.Librarian;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author a1 = new Author( "Рэй", "Брэдбери", 1920);
		Author a2 = new Author( "Дениэл", "Киз", 1927);
		Author a3 = new Author( "Джейн", "Остин", 1775);
		Author a4 = new Author( "Оскар", "Уайлд", 1854);
		Author a5 = new Author( "Эльчин", "Сафарли", 1984);
		
		Book b1 = new Book();
		b1.setTitle ("Вино из одуванчиков") ;
		b1.setYear(2015);
		b1.setAuthor(a1);
		
		Book b2 = new Book();
		b2.setTitle ("Цветы для Элджернона") ;
		b2.setYear(2017);
		b2.setAuthor(a2);
		
		Book b3 = new Book("Эмма", 2017, a3);
//		b3.setTitle ("Эмма") ;
//		b3.setYear(2017);
//		b3.setAuthor(a3);
		
		Book b4 = new Book("Гордость и предубеждение", 2017, a3);
//		b4.setTitle ("Гордость и предубеждение") ;
//		b4.setYear(2017);
//		b4.setAuthor(a3);
		
		Book b5 = new Book("Портрет Дориана Грея", 2012, a4);
//		b5.setTitle ("Портрет Дориана Грея") ;
//		b5.setYear(2012);
//		b5.setAuthor(a4);
		
		Book b6 = new Book("Когда я вернусь, будь дома", 2017, a5);
//		b6.setTitle ("Когда я вернусь, будь дома") ;
//		b6.setYear(2017);
//		b6.setAuthor(a5);
		
		Book b7 = new Book("Расскажи мне о море", 2016, a5);
//		b7.setTitle ("Расскажи мне о море") ;
//		b7.setYear(2016);
//		b7.setAuthor(a5);
		
		Book b8 = new Book("Эмма", 2016, a3);
//		b8.setTitle ("Эмма") ;
//		b8.setYear(2016);
//		b8.setAuthor(a3);
		
		Book b9 = new Book("Виноград", 2016, a3, a4);
//		b9.setTitle ("Виноград") ;
//		b9.setYear(2016);
//		b9.setAuthor(a3);
//		b9.setAuthor1(a4);
		
		Book b10 = new Book("Люди", 2016, a3, a5);
//		b10.setTitle ("Ольга") ;
//		b10.setYear(2016);
//		b10.setAuthor(a3);
//		b10.setAuthor1(a5);
		
		
        LibraryCatalog catalog = new LibraryCatalog(10);
        catalog.addBook(b1);
        catalog.addBook(b2);
        catalog.addBook(b3);
        catalog.addBook(b4);
        catalog.addBook(b5);
        catalog.addBook(b6);
        catalog.addBook(b7);
        catalog.addBook(b8);
        catalog.addBook(b9);
        catalog.addBook(b10);
        
        
        Librarian librarian = new Librarian();
		librarian.printCatalog(catalog);
		librarian.printOneBook(b1);
		librarian.selectBookByAuthor(catalog, a3);
		Book [] foundbooks = librarian.selectBookByAuthor(catalog,a3);
		librarian.printBooks(foundbooks);
		librarian.selectBookByTitle(catalog, a4, "Портрет Дориана Грея", 2012);
		Book [] foundbookTitle = librarian.selectBookByTitle(catalog, a4, "Портрет Дориана Грея", 2012);
		librarian.printBooks(foundbookTitle);
		
		
		
		System.out.println();
        
        
	}

}
