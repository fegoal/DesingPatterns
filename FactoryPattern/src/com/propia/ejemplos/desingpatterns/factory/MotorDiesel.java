package com.propia.ejemplos.desingpatterns.factory;

public class MotorDiesel implements IMotor {

	String combustible ="DIESEL";
	
	@Override
	public String getCombustible() {
		return combustible;
	}

}
