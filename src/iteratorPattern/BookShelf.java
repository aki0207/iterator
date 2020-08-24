package iteratorPattern;

import java.util.ArrayList;

//本棚を表す
//このクラスを集合体として扱うためAggregateインターフェースを実装している
public class BookShelf implements Aggregate {

	private ArrayList<Book> books;
	private int last = 0;

	public BookShelf() {
		this.books = new ArrayList<>();
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

	@Override
	public Iterator iterator() {
		return new BookShelflfIterator(this);
	}


}
