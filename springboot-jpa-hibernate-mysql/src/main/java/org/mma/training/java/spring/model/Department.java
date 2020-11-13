package org.mma.training.java.spring.model;

public class Department {
	
	private int id;
	private String name;
	private String manager;
	
	
	
	//no args constructor
	public Department() {
		
		
	}

	
	//field constructor
	public Department(int id, String name, String manager) {
		super();
		this.id = id;
		this.name = name;
		this.manager = manager;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getManager() {
		return manager;
	}


	public void setManager(String manager) {
		this.manager = manager;
	}


	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", manager=" + manager + "]";
	}
	
	

	

}
