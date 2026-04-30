package Controllers;

import Views.AuthViews;
import Views.RegisterView;


public class AuthController {
	
private AuthViews vista;
private RegisterView registro;
	
	public AuthController() {
		vista = new AuthViews(this);
		registro = new RegisterView(this);
	}
	
	public void login()
	{
		vista.loginview();
	}
	
	public void register()
	{
		registro.registerView();
	}
}
