package com.sample.gof23.service.behavioralpattern.state;

/**
 * @author 王贤
 */
public class ProjectDevelopmentState extends State {
	@Override
	public void doWork(Project project){
		System.out.println(project.getProjectName()+"正在进行开发工作");
	}

}
