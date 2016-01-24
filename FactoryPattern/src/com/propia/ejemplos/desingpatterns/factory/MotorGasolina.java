package com.propia.ejemplos.desingpatterns.factory;

public class MotorGasolina implements IMotor {

	String combustible ="GASOLINA";
	
	@Override
	public String getCombustible() {
		// TODO Auto-generated method stub
		return combustible;
	}

}
