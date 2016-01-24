package com.propia.ejemplos.desingpatterns.factory;
/**
 * EL patron Factory fabrica instancias de clases en
 * funcion del tipo que se le pasa
 * @author 
 *
 */
public class Main {

	public static int MOTOR_GASOLINA = 0;
	public static int MOTOR_DIESEL = 1;
	public static void main(String[] args) {

		Main appMain = new Main();
		
		System.out.println("Iniciando pagron Factory......");
		IMotor motor = MotorFactory.createInstance(MOTOR_GASOLINA);
		appMain.printTipoCombustible(motor);
		motor = MotorFactory.createInstance(MOTOR_DIESEL);
		appMain.printTipoCombustible(motor);
		
	}
	
	private void printTipoCombustible(IMotor motor){
		
		System.out.format("Combustible utilizado por motor: %s", motor.getCombustible());
		
	}

}
