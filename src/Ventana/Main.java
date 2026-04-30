package Ventana;

import Controllers.AuthController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ventana miventana=new Ventana();
		//miventana.calculadora();
		//miventana.registro();
		//miventana.users();
		AuthController control = new AuthController(); 
		control.login();
	}
}
