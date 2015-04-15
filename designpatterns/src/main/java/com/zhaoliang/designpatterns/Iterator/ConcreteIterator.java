package com.zhaoliang.designpatterns.Iterator;

public class ConcreteIterator implements Iterator {

	private ConcreteAggregate aggregate;

	private int index = -1;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if (index < this.aggregate.size()) {
			index = index + 1;
		}
	}

	@Override
	public boolean isDone() {
		if (index == this.aggregate.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object currentItem() {
		return this.aggregate.get(index);
	}

}
