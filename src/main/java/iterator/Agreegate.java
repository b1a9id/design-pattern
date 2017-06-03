package iterator;

/**
 * 集合体を表す
 */
public interface Agreegate {

	/**
	 * 集合体に対応するIteratorを1個作成する
	 * @return
	 */
	public abstract Iterator iterator();
}
