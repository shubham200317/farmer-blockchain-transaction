package Porject1;

import java.util.Objects;

public class User {
	
	private String userId;
	private String username;
	private String password;
	private String role;
	
	public User(String userId, String username, String password, String role)
	{
		this.userId = userId;
		this.username = username;
		this.password = Integer.toHexString(Objects.hash(password));
		this.role = role;
	}
	
	public boolean authenticate(String username, String password)
	{
		return this.username.equals(username) &&
				this.password.equals(Integer.toHexString(Objects.hash(password)));
	}
	
	public String getUserId()
	{
		return userId;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getRole()
	{
		return role;
	}
	
	@Override
	public String toString()
	{
		return "UserID: " + userId + ", Username: " + username + ", Role: " + role;
	}

}
