package com.sample.gof23.service.behavioralpattern.mediator;

/**
 * @author 王贤
 */
public class TechnicalDirector extends Mediator {

	private ProjectA projectA;
	private ProjectB projectB;
	private String directorName;

	public TechnicalDirector(){}
	
	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public ProjectA getProjectA() {
		return projectA;
	}

	public void setProjectA(ProjectA projectA) {
		this.projectA = projectA;
	}

	public ProjectB getProjectB() {
		return projectB;
	}

	public void setProjectB(ProjectB projectB) {
		this.projectB = projectB;
	}

	@Override
	public void doCoordination() {
		

	}

}
