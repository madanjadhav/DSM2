package com.cjc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Deparment_Details")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dep_id;
	private String dep_name;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="department")
	private List<Employee> employee=new ArrayList<>();
	
	public int getDep_id() {
		return dep_id;
	}
	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Department [dep_id=" + dep_id + ", dep_name=" + dep_name + ", employee=" + employee + "]";
	}
	 
	

}
