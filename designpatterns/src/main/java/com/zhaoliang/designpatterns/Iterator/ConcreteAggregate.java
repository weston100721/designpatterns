package com.zhaoliang.designpatterns.Iterator;

public class ConcreteAggregate extends Aggregate {
	
	private String[] ss = null;
	
	public ConcreteAggregate(String[] ss) {
		this.ss = ss;
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	public Object get(int index){
		Object retObj = null;
		if(index < ss.length){
			retObj = ss[index];
		}
		return retObj;
	}

	public int size(){
		return this.ss.length;
	}
}
