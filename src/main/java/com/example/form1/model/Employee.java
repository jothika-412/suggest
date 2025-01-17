package com.example.form1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
	@Table(name = "employee")
	public class Employee {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private int age;
	    private double salary;

	    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	    private EmployeeDetails employeeDetails;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public EmployeeDetails getEmployeeDetails() {
			return employeeDetails;
		}

		public void setEmployeeDetails(EmployeeDetails employeeDetails) {
			this.employeeDetails = employeeDetails;
		}

		

		

	    
	}


