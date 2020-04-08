package iteratorPattern;

// BookShelfクラスのスキャンを行う
// Iteratorとして扱うためIteratorインターフェースを実装している
public class BookShelflfIterator implements Iterator {

	// スキャンする本棚
	private BookShelf bookShelf;
	private int index;

	public BookShelflfIterator() {
	}

	public BookShelflfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}


	@Override
	public boolean hasNext() {
		return index < bookShelf.getLength();
	}

	@Override
	public Object returnCurrentElementAndAdvanceToNextPosition() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
