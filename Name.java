package com.AmazingSoftwareCompany1;

public class Name {
    
	/**
	 * 
	 */
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
	public char getTitle() {
		return title;
	}
	public void setTitle(char title) {
		this.title = title;
	}
	char title;
	String fName;
	String lName;
	@Override
	public String toString() {
		return "Name [fName=" + fName + ", lName=" + lName + "]";
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
}
