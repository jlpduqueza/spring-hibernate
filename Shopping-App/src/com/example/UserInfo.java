package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserInfo {

	@Id
	private Integer id;
	private String firstName;
	private String middileName;
	private String lastName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddileName() {
		return middileName;
	}
	public void setMiddileName(String middileName) {
		this.middileName = middileName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
