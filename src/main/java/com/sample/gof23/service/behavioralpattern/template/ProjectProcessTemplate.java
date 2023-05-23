package com.sample.gof23.service.behavioralpattern.template;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王贤
 */
public abstract class ProjectProcessTemplate {
		
	public Map<String,String>  processMap = new HashMap<>();
	

	public void feasibilityProcess(String content){
		processMap.put("feasibilityProcess", content);
	}

	public void technicalDiscussionProcess(String content){
		processMap.put("technicalDiscussionProcess", content);
	}

	public void bidProcess(String content){
		processMap.put("bidProcess", content);
	}

	public void requirementProcess(String content){
		processMap.put("requirementProcess", content);
	}

	public void designProcess(String content){
		processMap.put("designProcess", content);
	}

	public void programProcess(String content){
		processMap.put("programProcess", content);
	}

	public void testProcess(String content){
		processMap.put("testProcess", content);
	}

	public void deploymentProcess(String content){
		processMap.put("deploymentProcess", content);
	}

	public void maintenanceProcess(String content){
		processMap.put("maintenanceProcess", content);
	}
	
	public void showProcess(){
		String key;
		String value;
		for (String s : processMap.keySet()) {
			key = s;
			value = processMap.get(key);
			System.out.println("过程: " + key + "; 内容: " + value);
		}
	}
}
