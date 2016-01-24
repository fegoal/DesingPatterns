package com.propia.ejemplos.desingpatterns.factory_method.factory_method;

public class DieselFactory extends MotorFactory{

	@Override
	public IMotor getMotor() {
		return new MotorDiesel();
	}
	

}
