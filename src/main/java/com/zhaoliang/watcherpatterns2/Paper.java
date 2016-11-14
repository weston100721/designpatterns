package com.zhaoliang.watcherpatterns2;

import java.util.Observable;

public class Paper extends Observable {
	private String content = "the content of Paper";

	public String getConent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		setChanged();
		notifyObservers(content);
	}
}
