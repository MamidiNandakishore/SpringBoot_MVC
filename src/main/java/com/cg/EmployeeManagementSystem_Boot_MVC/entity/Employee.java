package com.cg.EmployeeManagementSystem_Boot_MVC.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private String department;
	private String email;
	private long mobNum;
	
	public Employee(){
		
	}
	public Employee(long id, String name, String department, String email, long mob_num) {
		super();
		this.id = id;
		this.name = name;
		this.department= department;
		this.email = email;
		this.mobNum = mob_num;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String dept) {
		this.department = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMob_num() {
		return mobNum;
	}
	public void setMob_num(long mob_num) {
		this.mobNum = mob_num;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Department=" + department + ", email=" + email + ", mob_num=" + mobNum
				+ "]";
	}
	
	
}
