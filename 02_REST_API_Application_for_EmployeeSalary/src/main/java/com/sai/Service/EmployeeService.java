package com.sai.Service;

import java.util.List;

import com.sai.Entity.EmployeSalary;

public interface EmployeeService {
	
 public	EmployeSalary saveEmployee(EmployeSalary employeSalary);
 public	EmployeSalary UpdateEmployee(long employeeID ,EmployeSalary employeSalary);
 public	EmployeSalary getEmployee(long employeeID);
 public	List<EmployeSalary> getAllEmployee();
 public void deleteEmployee(long employeeID);
}
