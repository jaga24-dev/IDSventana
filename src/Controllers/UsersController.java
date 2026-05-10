package Controllers;

import java.util.ArrayList;

import Models.User;
import Views.UsersView;

public class UsersController {
	public UsersView view;
	private User model;
	
	public UsersController() {
		view = new UsersView();
		model = new User();
	}
	
	public void showUsers()
	{
		ArrayList<User> users = model.get();
		view.tableUsers(users);
		view.setVisible(true);
	}
}
