package com.marlabs.hbm;

public class Customer {
private int id;
private String firstName, lastName;
private String emailId;

public Customer() {

}

public Customer(int id, String firstName, String lastName,String emailId) {
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId=emailId;
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
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getemailId(){
	return emailId;
}
public void setemailId(String emailId){
	this.emailId=emailId;
}

}
