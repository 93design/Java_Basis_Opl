package LibraryEnum;

public class Library {
	
	private String name;
	private Writer[] writers;
	private Book[] books;
	
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
	
}
