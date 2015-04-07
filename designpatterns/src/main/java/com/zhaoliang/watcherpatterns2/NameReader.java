package com.zhaoliang.watcherpatterns2;

import java.util.Observable;
import java.util.Observer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameReader implements Observer {
	
	private String pattern ="";
	
	public NameReader(String pattern) {
		this.pattern = pattern;
	}
	
	
	private boolean shouldProcess(String s){
		Matcher m = Pattern.compile(pattern).matcher(s);
		if(m.find()){
			return true;
		}
		return false;
	}

	@Override
	public void update(Observable o, Object arg) {
		String content = (String) arg;
		if(shouldProcess(content)){
			System.out.println(pattern + "  " + content + "  已经被处理");
		}else{
			System.out.println(pattern + "  " + content + "  没有处理");
		}
	}

}
