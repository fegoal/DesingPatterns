package com.command;


/**
 * El invoker recibira peticiones de commandos sobre los receivers.
 * @author a591792
 *
 */
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
