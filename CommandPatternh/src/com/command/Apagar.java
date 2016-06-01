package com.command;


/**
 * Comman concreto. Implementa el execute del Abstract command
 * @author a591792
 *
 */
public class Apagar implements Command{
	
	Luz luz;
	
	public Apagar with(Luz luz){
		this.luz = luz;
		return this;
	}
	
	@Override
	public void execute(){
		this.luz.apagar();
	}

}
