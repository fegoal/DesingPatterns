package com.command;

public class Main {

	public static void main(String[] args) {

		Luz deCruce = new Luz();
		Luz dePosicion = new Luz();
		
		Command encenderCruce = new Encender().with(deCruce);
		Command apagarCruce = new Apagar().with(deCruce);
		Command encenderPosicion = new Encender().with(dePosicion);
		Command apagarPosicion = new Apagar().with(dePosicion);
		
		LucesInvoker invoker = new LucesInvoker();
		invoker.withCommand(encenderCruce).pressSwitch();
		invoker.withCommand(apagarCruce).pressSwitch();
		invoker.withCommand(encenderPosicion).pressSwitch();
		invoker.withCommand(apagarPosicion).pressSwitch();

		
	}

}
