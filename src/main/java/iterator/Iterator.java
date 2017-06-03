package iterator;

/**
 * 数え上げスキャンを行う
 */
public interface Iterator {

	/**
	 * 次の要素が存在するか
	 * @return
	 */
	public abstract boolean hasNext();

	/**
	 * 次の要素を得る
	 * @return
	 */
	public abstract Object next();
}
