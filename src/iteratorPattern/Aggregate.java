package iteratorPattern;


// 数え上げを行うものの「集合体」を表す
// このインターフェースを実装したクラスは、配列のように「何かがたくさん集まっているもの」になる
public interface Aggregate {
	// 集合体に対応するiteratorを作成する
	// 集合体を数えたい、スキャンしたい、1つづつ調べていきたい場合、iteratorメソッドを使用し
	// Iteratorインターフェースを実装したクラスのインスタンスを1つ作る
	public abstract iteratorPattern.Iterator iterator();
}
