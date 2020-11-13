package org.mma.training.java.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	
	@Id
	private long id;
	private String firstname;
	private String lastname;
	private String manager;
	//private Department department;
	
	//no arg constructor
	public Employee() {
	
	}
	// field constructor
//	public Employee(int id, String firstname, String lastname, String manager, Department department) {
	public Employee(int id, String firstname, String lastname, String manager) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.manager = manager;
		//this.department = department;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
//	public Department getDepartment() {
//		return department;
//	}
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
	@Override
//	public String toString() {
//		return "My Employee information [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", manager=" + manager
//				+ ", department=" + department + "]";
//	}
	
	public String toString() {
		return "My Employee information [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", manager=" + manager
				+ ", department=" + "]";
	}
	
	
	

	
	

}
