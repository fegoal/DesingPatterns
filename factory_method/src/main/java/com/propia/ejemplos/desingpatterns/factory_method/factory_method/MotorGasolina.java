package com.propia.ejemplos.desingpatterns.factory_method.factory_method;

public class MotorGasolina implements IMotor {

	private static String COMBUSTIBLE = "GASOLINA";
	
	public String getCombustible() {
		
		return COMBUSTIBLE;
	}

}
