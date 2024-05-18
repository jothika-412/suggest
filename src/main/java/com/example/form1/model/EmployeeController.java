package com.example.form1.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

	
	
	@Autowired
	private  EmployeeRepository employeeRepository;
	
	@Autowired
	private  EmployeeDetailsRepository employeeDetailsRepository;

	@GetMapping("/employeeForm")
	public String showEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "employee";
	}
	
	@PostMapping("/submitEmployee")
	public String submitEmployeeForm(@ModelAttribute("employee") Employee employee, Model model) {
		Employee savedEmployee = employeeRepository.save(employee);
		model.addAttribute("employeeDetails", new EmployeeDetails());
		model.addAttribute("id", savedEmployee.getEmployeeDetails());
		return "employeeDetails";
	}
	
	@PostMapping("/submitEmployeeDetails")
	public String submitEmployeeDetails(@ModelAttribute("employeedetails") EmployeeDetails employeeDetails) {
		employeeDetailsRepository.save(employeeDetails);
		return "redirect:/process";
	}


}









//    @GetMapping("/employees")
//    public String getAllEmployees(Model model) {
//		model.addAttribute("employee", new Employee());
//        return "employee";
//    }
    
    
    
//    @PostMapping("/submitEmployee")
//	public String submitEmployeeForm(@ModelAttribute("employee") Employee employee, Model model) {
//		Employee savedEmployee = employeeRepository.save(employee);
//		model.addAttribute("employeeDetails", new EmployeeDetails());
//		model.addAttribute("id", savedEmployee.getEmployeeDetails());
//		return "employee";
//	}


