package com.sample.gof23.service.behavioralpattern.memento;

/**
 * @author 王贤
 */
public class Memento {
	
	private String meetName;
	private String meetType;
	private String meetDate;
	private String  meetLeader;
	private String  meetParticipants;
	private String decide;
	private String  meetContent;
	
	public Memento(String meetName, String meetType, String meetDate,
			String meetLeader, String meetParticipants, String decide,
			String meetContent) {
		super();
		this.meetName = meetName;
		this.meetType = meetType;
		this.meetDate = meetDate;
		this.meetLeader = meetLeader;
		this.meetParticipants = meetParticipants;
		this.decide = decide;
		this.meetContent = meetContent;
	}
	
	public void showContent(){
		System.out.println(meetContent);
	}

	public String getMeetName() {
		return meetName;
	}

	public void setMeetName(String meetName) {
		this.meetName = meetName;
	}

	public String getMeetType() {
		return meetType;
	}

	public void setMeetType(String meetType) {
		this.meetType = meetType;
	}

	public String getMeetDate() {
		return meetDate;
	}

	public void setMeetDate(String meetDate) {
		this.meetDate = meetDate;
	}

	public String getMeetLeader() {
		return meetLeader;
	}

	public void setMeetLeader(String meetLeader) {
		this.meetLeader = meetLeader;
	}

	public String getMeetParticipants() {
		return meetParticipants;
	}

	public void setMeetParticipants(String meetParticipants) {
		this.meetParticipants = meetParticipants;
	}

	public String getDecide() {
		return decide;
	}

	public void setDecide(String decide) {
		this.decide = decide;
	}

	public String getMeetContent() {
		return meetContent;
	}

	public void setMeetContent(String meetContent) {
		this.meetContent = meetContent;
	}
	
	

}
