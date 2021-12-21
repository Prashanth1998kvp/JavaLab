package com;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	int sid;
	String name;
			
	public int getsid() {
		return sid;
	}
	public void setsid(int sid) {
		this.sid=sid;
	
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}

}
