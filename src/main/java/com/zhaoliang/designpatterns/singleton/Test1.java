package com.zhaoliang.designpatterns.singleton;

public class Test1 {
	public static void main(String[] args) {
		AppConfig config = AppConfig.getInstance();
		System.out.println(config.getParameterA());
		System.out.println(config.getParameterB());
	}
}
