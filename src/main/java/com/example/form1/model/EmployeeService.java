package com.example.form1.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
	public class EmployeeService {
	    @Autowired
	    private EmployeeRepository employeeRepository;

	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }
	    @Autowired
	    private EmployeeDetailsRepository employeeDetailsRepository;

	    public List<Employee> getAllEmployees1() {
	        return employeeRepository.findAll();
	    }

			// TODO Auto-generated method stub
	    public Employee save(Employee employee) {
			// TODO Auto-generated method stub
			return null;
		}
		
				

		public Employee save(EmployeeDetails employeeDetails) {
			// TODO Auto-generated method stub
			return null;
		}
		
			
		}
	

