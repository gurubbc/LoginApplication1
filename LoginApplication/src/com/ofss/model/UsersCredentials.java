package com.ofss.model;

public class UsersCredentials {
	public static boolean validteUser(String username, String password)
	{
		// dummy logic
		// connect to DB and verify the username against the rows
		if (username.equals("oracle") && password.equals("oracle"))
			return true;
		else
			return false;
	}
}
