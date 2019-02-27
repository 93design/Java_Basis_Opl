package LibraryEnum;

public class Book {
	
	private String title;
	private int pages;
	private BookCategory category;
	
	
	public Book(String title, int pages, BookCategory category) {
		super();
		this.title = title;
		this.pages = pages;
		this.category = category;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public BookCategory getCategory() {
		return category;
	}


	public void setCategory(BookCategory category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", pages=" + pages + ", category=" + category + "]";
	}
	
	
	
	
	
	
	

	
}
