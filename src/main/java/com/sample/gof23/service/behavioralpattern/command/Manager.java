package com.sample.gof23.service.behavioralpattern.command;

/**
 * @author 王贤
 */
public class Manager {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void executeCommand() {
		command.execute();
	}

}
