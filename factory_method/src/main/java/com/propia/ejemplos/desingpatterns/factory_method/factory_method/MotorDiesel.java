package com.propia.ejemplos.desingpatterns.factory_method.factory_method;

public class MotorDiesel implements IMotor {

	private static String COMBUSTIBLE = "GASOIL";
	
	public String getCombustible() {
		
		return COMBUSTIBLE;
	}

}
