package com.practice.SpringPractice;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private int empid;
	private String name;
	@Autowired
	@Qualifier("sal1")
	private Salary sal;
	private List<String> phone;
	private Set<String> address;
	private Map<String,String> projectid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Salary getSal() {
		return sal;
	}
	public void setSal(Salary sal) {
		this.sal = sal;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getProjectid() {
		return projectid;
	}
	public void setProjectid(Map<String, String> projectid) {
		this.projectid = projectid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + ", phone=" + phone + ", address="
				+ address + ", projectid=" + projectid + "]";
	}
	
	
	

}
