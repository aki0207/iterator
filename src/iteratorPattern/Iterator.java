package iteratorPattern;

// 要素の数え上げを行うもの、ループ変数のような役割を果たすもの
public interface Iterator {
	// 次の要素があるかどうかを調べる
	public abstract boolean hasNext();
	// 集合体の要素を1つ返し、インデックスを次の位置に進める
	public abstract Object returnCurrentElementAndAdvanceToNextPosition();
}
