package com.command;


/** Este seria el receiver. El ojb que se quiere manipular a traves de los commands
 * 
 * @author a591792
 *
 */
public class Luz{
	
	private Boolean encendida;
	
	
	public void encender(){
		this.encendida = Boolean.TRUE; 
		System.out.println("Luz encendida");
	}

	
	public void apagar(){
		this.encendida = Boolean.TRUE;
		System.out.println("Luz apagada");
	}

	
}
