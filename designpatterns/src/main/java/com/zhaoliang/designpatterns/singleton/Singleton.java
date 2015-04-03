package com.zhaoliang.designpatterns.singleton;

/**
 * 这种模式综合使用了Java的类级内部类和多线程缺省同步锁的知识，很巧妙地同时实现了延迟加载和线程安全。
 * 
 * @author Administrator
 *
 */
public class Singleton {
	private static class SingletonHolder {
		private static Singleton instance = new Singleton();
	}

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}
