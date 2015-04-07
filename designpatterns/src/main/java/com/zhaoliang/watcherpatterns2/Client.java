package com.zhaoliang.watcherpatterns2;

public class Client {
	public static void main(String[] args) {
		NameReader zhao = new NameReader("(@zhao)?\\s*");
		NameReader xie = new NameReader("(@zhao)?\\s+fetch");
		Paper p = new Paper();
		p.addObserver(zhao);
		p.addObserver(xie);
		p.setContent("@zhao ");
		System.out.println("------------------------------------------------");
		p.setContent("@zhao fetch");
	}
}
