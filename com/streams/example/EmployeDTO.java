package com.streams.example;

import java.util.List;

public class EmployeDTO {
	
	private int id;
	private String name;
	private long salary;
	private List<String> phone;
	
	public EmployeDTO(int id,String name,long salary,List<String> phone)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.phone=phone;
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "EmployeDTO [id=" + id + ", name=" + name + ", salary=" + salary + ", Phone="+ phone.toString() +"]";
	}



	


	

}
