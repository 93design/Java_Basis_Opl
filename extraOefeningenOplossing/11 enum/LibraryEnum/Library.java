package LibraryEnum;

import java.util.Arrays;

public class Library {
	
	private String name;
	private Writer[] writers= new Writer[0];
	private Book[] books = new Book[0];
	
	public Library(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Writer[] getWriters() {
		return writers;
	}

	public void setWriters(Writer[] writers) {
		this.writers = writers;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public void addBook(Book bookIn) {
		books = Arrays.copyOf(books, books.length+1);
		books[books.length-1] = bookIn;
	}	
	
	public void printCategory(BookCategory category) {
		System.out.println("Listing the " + category + "collection");
		int count= 0;
		for(Book book: books) {
			if(book.getCategory().equals(category)) {
				System.out.println(book);
				count++;
			}
		
		}
		System.out.println("we have" + count + " books of this category");
		
	}
	
	public void printBooks() {
		for(Book book: books) {
			System.out.println(book);
		}
	}
}
