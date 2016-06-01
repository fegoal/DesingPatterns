package com.command;

public class Encender implements Command{
	
	Luz luz;
	
	public Encender with(Luz luz){
		this.luz = luz;
		return this;
	}
	
	@Override
	public void execute(){
		this.luz.encender();
	}
	

}
