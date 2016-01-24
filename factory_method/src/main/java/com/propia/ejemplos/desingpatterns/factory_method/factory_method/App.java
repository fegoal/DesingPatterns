package com.propia.ejemplos.desingpatterns.factory_method.factory_method;

/**
 * Util cuando no se sabe hasta tiempo de ejecucion que tipo de clase concreta (IConcrete) y en
 * consequencia que Factory se va a utilizar.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Iniciando ejemplo factory method ............" );
        //Producto abstracto
        IMotor motor;
        
        //Cambiamos la factorya a GasolinaFactory - MOTORES GASOLINA
        //Factorya abstracta que se instancia con el tipo concreto de factoria.
        MotorFactory motorGasolinaFactory = new GasolinaFactory();
        motor = motorGasolinaFactory.getMotor();
        System.out.println(" Motor obtenido de la factoria GasolinaFactory: " + motor.getCombustible() );
        
        //Cambiamos la factorya a DieselFactory - MOTORES DESEL
        MotorFactory motorDieselFactory = new DieselFactory();
        motor = motorDieselFactory.getMotor();
        System.out.println(" Motor obtenido de la factoria GasolinaFactory: " + motor.getCombustible() );

        
    }
}
