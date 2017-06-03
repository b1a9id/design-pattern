package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Agreegate {

	private List<Book> books;

	private int last = 0;

	public BookShelf(int maxSize) {
		this.books = new ArrayList<Book>(maxSize);
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void appendBook(Book book) {
		this.books.add(book);
		last++;
	}

	public int getLength() {
		return last;
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
