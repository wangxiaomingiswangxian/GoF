package com.sample.gof23.service.behavioralpattern.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王贤
 */
public class Caretaker {
	
	private final Map<String, Memento> meetMementoMap = new HashMap<>();

	public Memento recoveryMemento(String meetDate) {
		return meetMementoMap.get(meetDate);
	}

	public void saveMemento(String meetDate, Memento memento) {
		this.meetMementoMap.put(meetDate, memento);
	}
	
	public void showContent(){
		System.out.println("显示全部的会议情况：");		
		String meetDate;
		String meetContent;
		for (String s : meetMementoMap.keySet()) {
			meetDate = s;
			meetContent = meetMementoMap.get(meetDate).getMeetContent();
			System.out.print(meetDate + ";" + meetContent);
			System.out.println();
		}	
		
	}

}
