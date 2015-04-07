package com.zhaoliang.watcherpatterns;

public class ConcreteWatcher implements Watcher {

	@Override
	public void update(Watched watched) {
		ConcreteWatched cw = (ConcreteWatched) watched;
		System.out.println(cw.toString());
	}

}
