package com.codingdojo.teamroster.models;
import java.util.*;
public class Player {
	
	String firstname;
	String lastname;
	int age;
	int id;
	
	public Player(String firstname, String lastname, int age, int id){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
