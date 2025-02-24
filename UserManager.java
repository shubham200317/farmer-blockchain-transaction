package Porject1;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
	
	private Map<String, User> users;
	
	public UserManager()
	{
		users = new HashMap<>();
	}
	
	public void registerUser(String userId, String username, String password, String role)
	{
		if(users.containsKey(userId))
		{
			System.out.println("UserID already exists.");
			return;
		}
		users.put(userId, new User(userId, username, password, role));
		System.out.println("User registered successfully.");
	}
	
	public User authenticateUser(String username, String password)
	{
		for(User user: users.values())
		{
			if(user.authenticate(username, password))
			{
				System.out.println("Authentication successful. Welcome, " + username + "!");
				return user;
			}
		}
		
		System.out.println("Authentication failed. Invalid credentials.");
		return null;
	}
	
	public User getUserById(String userId)
	{
		return users.get(userId);
	}
	
	public void displayUsers()
	{
		for(User user: users.values())
		{
			System.out.println(user);
		}
	}
}
