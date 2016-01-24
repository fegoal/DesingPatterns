package com.propia.ejemplos.desingpatterns.factory_method.factory_method;

public class GasolinaFactory extends MotorFactory{

	@Override
	public IMotor getMotor() {
		return new MotorGasolina();
	}
	

}
