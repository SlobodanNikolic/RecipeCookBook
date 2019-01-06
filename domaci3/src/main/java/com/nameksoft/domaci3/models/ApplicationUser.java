package com.nameksoft.domaci3.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class ApplicationUser {
	@Id
	String Id;
	String username;
	String password;
	
	public ApplicationUser(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public ApplicationUser() {
		
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
