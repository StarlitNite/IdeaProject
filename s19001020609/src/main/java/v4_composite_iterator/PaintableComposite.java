package v4_composite_iterator;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

/**
 * 可描绘组合
 * 
 * 组合和迭代器设计模式
 * 
 * 组合设计模式旨在提供树组织结构并以统一的方式对待他们
 */
public abstract class PaintableComposite {
	List<PaintableComposite> children = new ArrayList<>();

	/**
	 * 添加子可描绘组合
	 * 
	 * @param paintable 可描绘组合 
	 */
	public void add(PaintableComposite paintable) {
		this.children.add(paintable);
	}
	
	/**
	 * 清理子可描绘组合
	 */
	public void removeAll() {
		this.children.clear();
	}

	public int count() {
		return this.children.size();
	}

	/**
	 * 迭代器模式
	 * 
	 * 无需提供获取列表方法而直接访问可遍历元素。
	 */
	public Iterator<PaintableComposite> iterator() {
		return new Iterator<PaintableComposite>() {
			private int index = 0;

			/**
			 * 是否有元素可以遍历
			 */
			@Override
			public boolean hasNext() {
				return index < PaintableComposite.this.children.size();
			}

			/**
			 * 获取下一个可描绘组合
			 */
			@Override
			public PaintableComposite next() {
				if (hasNext()) {
					return children.get(index++);
				}
				return null;
			}
		};

	}

	/**
	 * 将可描绘组合描绘在 JFrame 上
	 * @param frame 目标 JFrame
	 */
	public void onPaint(JFrame frame) {
		//使用迭代器遍历进行描绘
		Iterator<PaintableComposite> iterator = this.iterator();
		while (iterator.hasNext()) {
			PaintableComposite composite = iterator.next();
			composite.onPaint(frame);
		}
	}
}
