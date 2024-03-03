package com.sai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sai.Entity.EmployeSalary;
import com.sai.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public ResponseEntity<EmployeSalary> saveEmployee(@RequestBody EmployeSalary employeSalary)
	{
		EmployeSalary employee=employeeService.saveEmployee(employeSalary);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
		
	}
	
	@PutMapping("update/{employeeID}")
	public ResponseEntity<EmployeSalary> updateEmployee(@PathVariable long employeeID,@RequestBody EmployeSalary employeSalary)
	{
		EmployeSalary emp=employeeService.UpdateEmployee(employeeID, employeSalary);
		if (emp!=null) {
			return ResponseEntity.ok(emp);
		} else {
			return ResponseEntity.notFound().build();
		}
	
	}
	
	@GetMapping("/get/{employeeID}")
	public ResponseEntity<EmployeSalary> getEmployee(@PathVariable long employeeID)
	{
		EmployeSalary emp=employeeService.getEmployee(employeeID);
		if (emp!=null) {
			return ResponseEntity.ok(emp);
		} else {
			return ResponseEntity.notFound().build();
		}
	
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeSalary>> getAllEmployee()
	{
		List<EmployeSalary> emp=employeeService.getAllEmployee();
		
		return ResponseEntity.ok(emp);
	}
	
	@DeleteMapping("/delete/{employeeID}")
	public void deleteEmployee(@PathVariable long employeeID)
	{
		employeeService.deleteEmployee(employeeID);
		ResponseEntity.noContent().build();
	}
	
}
