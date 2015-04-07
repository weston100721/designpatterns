package com.zhaoliang.designpatterns.Iterator;

public interface Iterator {

	public void first();

	public void next();

	public boolean isDone();

	public Object currentItem();
}
