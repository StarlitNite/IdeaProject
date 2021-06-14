package v4_composite_iterator;

/**
 * 迭代器模式
 * 
 * @param <T> 迭代元素的类型
 */
public interface Iterator<T> {

	/**
	 * 检查是否还有下一个元素
	 * @return 如果有该元素返回 true，没有返回 false
	 */
	boolean hasNext();
	
	/**
	 * 获取下一个元素
	 * @return 存在返回 该元素，否则返回 null
	 */
	T next();
}
