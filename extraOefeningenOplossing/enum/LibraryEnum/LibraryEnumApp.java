package LibraryEnum;

public class LibraryEnumApp {

	public static void main(String[] args) {


		Library library = new Library("BiKorf");
		
		
		
		Writer writer1 = new Writer("JJR Tolkien");
		Book book1 = new Book("The hobbit", 500,BookCategory.FICTION);
		Book book2 = new Book("The FellowShip of the Ring", 500,BookCategory.FICTION);
		Book book3 = new Book("The Silmarillion", 500,BookCategory.FANTASY);
		
		Book[] tolkienBooks = {book1,book2,book3};
		writer1.setBooks(tolkienBooks);
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		//library.printBooks();
		library.printCategory(BookCategory.FICTION);
	}

}
