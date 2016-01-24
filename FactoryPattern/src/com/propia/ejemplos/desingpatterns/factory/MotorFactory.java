package com.propia.ejemplos.desingpatterns.factory;

public class MotorFactory {
	
	
	
	public static IMotor createInstance(int typoMotor){
		IMotor motor;
		
		switch (typoMotor){
		case 0:
			motor = new MotorGasolina();
			break;
		case 1: 
			motor  = new MotorDiesel();
			break;
		default:
			motor = null;
			break;
		}
		return motor;
	}
}
