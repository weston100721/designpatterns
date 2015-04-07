package com.zhaoliang.designpatterns.Iterator;

public class Client {
	
	public void someOperation(){
		String[] names = {"zhangsan","lisi","wangwu","zhaoliu"};
		Aggregate aggregate = new ConcreteAggregate(names);
		Iterator it = aggregate.createIterator();
		
		it.first();
		while(!it.isDone()){
			Object obj = it.currentItem();
			System.out.println("the obj = " + obj);
			it.next();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.someOperation();
	}
}
