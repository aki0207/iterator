package iteratorPattern;

public class Main {

	public static void main(String[] args) {

		// 本が4冊入る本棚を作成
		BookShelf bookShelf = new BookShelf(4);
		// 本棚に本を入れる
		bookShelf.appendBook(new Book("Around the world in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Longplegs"));
		// 本棚をスキャンするイテレーターのインスタンスを生成
		Iterator iterator = bookShelf.iterator();
		// 本棚に入っている本の数だけ繰り返す
		while (iterator.hasNext()) {
			// 本棚から本を取り出し、イテレーターを移動する
			Book book = (Book) iterator.returnCurrentElementAndAdvanceToNextPosition();
			// 本の名前を出力
			System.out.println(book.getName());
		}
	}

}
