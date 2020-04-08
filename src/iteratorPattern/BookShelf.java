package iteratorPattern;


//本棚を表す
//このクラスを集合体として扱うためAggregateインターフェースを実装している
public class BookShelf implements Aggregate {

	private Book[] books;
	private int last = 0;

	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}

	public Book getBookAt(int index) {
			return books[index];
	}

	public void appendBook(Book book) {
		this.books[last] = book;
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
