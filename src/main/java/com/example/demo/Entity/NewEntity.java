package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeDetails")
public class NewEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Name;
	private int Age;
	private int Salary = (int) (Math.random()*10000);
	private String designation;
	private long Phno=(long)(Math.random()*Math.pow(10, 10));
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = (int) salary;
	}
	public String getDeg() {
		return designation;
	}
	public void setDeg(String designation) {
		this.designation = designation;
	}
	public long getPhno() {
		return Phno;
	}
	public void setPhno(long phno) {
		this.Phno = phno;
	}
	
	
}
