package com.sample.gof23.service.behavioralpattern.state;

/**
 * @author 王贤
 */
public class ProjectBuilderState extends State{

	@Override
	public void doWork(Project project){		
		System.out.println(project.getProjectName()+"正在进行立项工作");
	}
}
