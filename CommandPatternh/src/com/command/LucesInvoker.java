package com.command;

public class LucesInvoker {
	
	Command command;
	
	public LucesInvoker withCommand(Command command){
		this.command = command;
		return this;
	}
	
	public void pressSwitch(){
		this.command.execute();
	}

}
