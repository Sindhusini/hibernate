package com.Trio;

import javax.persistence.*;

@Entity
@Table(name = "Student101")
public class Student {
	@Id
	private int s_id;
	private String s_name;
	private int s_age;
	
	
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_age() {
		return s_age;
	}
	public void setS_age(int s_age) {
		this.s_age = s_age;
	}

	//somechanges
	

}
