package com.sample.gof23.service.behavioralpattern.memento;

/**
 * @author 王贤
 */
public class Meeting {
	private String meetName;
	private String meetType;
	private String meetDate;
	private String meetLeader;
	private String meetParticipants;
	private String decide;
	private String meetContent;

	public Meeting(){}
	
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

	public void doDecide() {
		meetContent = "会议名称：" + meetName + ";";
		meetContent = meetContent + "会议类型：" + meetType + ";";
		meetContent = meetContent + "会议时间：" + meetDate + ";";
		meetContent = meetContent + "会议主持人：" + meetLeader + ";";
		meetContent = meetContent + "会议参加者：" + meetParticipants + "\r";
		meetContent = meetContent + "会议内容：" + meetParticipants + ";";
	}

	public Memento createMemento() {
		return new Memento(meetName, meetType, meetDate, meetLeader,
				meetParticipants, decide, meetContent);
	}
	
	public void recoveryMemento(Memento mo){
		meetName = mo.getMeetName();
		meetType = mo.getMeetType();
		meetDate = mo.getMeetDate();
		meetLeader = mo.getMeetLeader();
		meetParticipants = mo.getMeetParticipants();
		decide = mo.getDecide();
		meetContent = mo.getMeetContent();
	}
	
	public void showContent(){
		System.out.println(meetContent);
	}

}
