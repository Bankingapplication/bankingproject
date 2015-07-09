package com.marlabs.hbm;

public class UserName {
private int id;
private String firstName;
private String userName;

public UserName() {

}

public UserName(int id, String firstName, String username) {
	this.id = id;
	this.firstName = firstName;
	this.userName = userName;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String userName(){
	return userName;
}
public void setuserName(String userName){
	this.userName=userName;
}

}
