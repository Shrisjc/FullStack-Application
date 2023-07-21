package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "username")
	private String username;
	@Column(name = "name")
	private String name;
	@Column(name =  "email_id")
	private String email_id;
	
	  public User() {
		  
	  }
	  
	public User(int id, String firstName, String lastName, String email_id) {
		super();
		this.id = id;
		this.username = firstName;
		this.name = lastName;
		this.email_id = email_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getemail_id() {
		return email_id;
	}

	public void setemail_id(String email_id) {
		this.email_id = email_id;
	}

	
	

}
