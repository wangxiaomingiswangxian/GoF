package com.sample.gof23.service.behavioralpattern.state;

/**
 * @author 王贤
 */
public class ProjectEndState extends State{

	@Override
	public void doWork(Project project){
		System.out.println(project.getProjectName()+"正在进行结项工作");
	}

}
