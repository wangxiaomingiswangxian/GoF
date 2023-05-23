package com.sample.gof23.service.behavioralpattern.state;

/**
 * @author 王贤
 */
public class ProjectRunState extends State{

	@Override
	public void doWork(Project project){
		System.out.println(project.getProjectName()+"正在进行试运行工作");
	}

}
