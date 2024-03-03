package com.sai.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.Entity.EmployeSalary;
import com.sai.Repository.EmployeeRepository;
import com.sai.Service.EmployeeService;



@Service 
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public EmployeSalary saveEmployee(EmployeSalary employee) {
		// TODO Auto-generated method stub

		double ta=0.0;
		double da=0.0;
		double hra=0.0;
		double pf=0.0;
		double grossSalary=0.0;
		double netSalary=0.0;
		
		double employeeSalary=employee.getEmpSalary();
		
		if (employeeSalary < 45000) {
		   ta=employee.getEmpSalary()*0.07;
		} else if (employeeSalary >=45000 && employeeSalary < 80000)  {
			ta=employee.getEmpSalary()*0.11;
		}
		else if (employeeSalary >=80000)
		{
			ta=employee.getEmpSalary()*0.21;
		}
		
		
		if (employeeSalary < 45000) {
			   da=employee.getEmpSalary()*0.11;
			} else if (employeeSalary >=45000 && employeeSalary < 80000)  {
				da=employee.getEmpSalary()*0.17;
			}
			else if (employeeSalary >=80000)
			{
				da=employee.getEmpSalary()*0.27;
			}
		
		if (employeeSalary < 45000) {
			   hra=employee.getEmpSalary()*0.13;
			} else if (employeeSalary >=45000 && employeeSalary < 80000)  {
				hra=employee.getEmpSalary()*0.19;
			}
			else if (employeeSalary >=80000)
			{
				hra=employee.getEmpSalary()*0.19;
			}
		
		if (employeeSalary < 45000) {
			   pf=employee.getEmpSalary()*0.21;
			} else if (employeeSalary >=45000 && employeeSalary < 80000)  {
				pf=employee.getEmpSalary()*0.25;
			}
			else if (employeeSalary >=80000)
			{
				pf=employee.getEmpSalary()*0.27;
			}
		
		   employee.setTa(ta);
		   employee.setDa(da);
		   employee.setHra(hra);
		   employee.setPf(pf);
		   grossSalary=employee.getEmpSalary()+ ta+da+hra;
		    netSalary=grossSalary-pf;
		   employee.setGrossSalary(grossSalary);
		   employee.setNetSalary(netSalary);
				
		return employeeRepository.save(employee);
		
	
	}

	@Override
	public EmployeSalary UpdateEmployee(long employeeID, EmployeSalary employeSalary) {
    
		Optional<EmployeSalary> emp=employeeRepository.findById(employeeID);
		if (emp.isPresent()) {
			EmployeSalary employee=emp.get();
			employee.setEmpName(employeSalary.getEmpName());
			employee.setEmpSalary(employeSalary.getEmpSalary());
			double ta=0.0;
			double da=0.0;
			double hra=0.0;
			double pf=0.0;
			double grossSalary=0.0;
			double netSalary=0.0;
			
			double employeeSalary=employee.getEmpSalary();
			
			if (employeeSalary < 45000) {
			   ta=employee.getEmpSalary()*0.07;
			} else if (employeeSalary >=45000 && employeeSalary < 80000)  {
				ta=employee.getEmpSalary()*0.11;
			}
			else if (employeeSalary >=80000)
			{
				ta=employee.getEmpSalary()*0.21;
			}
			
			
			if (employeeSalary < 45000) {
				   da=employee.getEmpSalary()*0.11;
				} else if (employeeSalary >=45000 && employeeSalary < 80000)  {
					da=employee.getEmpSalary()*0.17;
				}
				else if (employeeSalary >=80000)
				{
					da=employee.getEmpSalary()*0.27;
				}
			
			if (employeeSalary < 45000) {
				   hra=employee.getEmpSalary()*0.13;
				} else if (employeeSalary >=45000 && employeeSalary < 80000)  {
					hra=employee.getEmpSalary()*0.19;
				}
				else if (employeeSalary >=80000)
				{
					hra=employee.getEmpSalary()*0.19;
				}
			
			if (employeeSalary < 45000) {
				   pf=employee.getEmpSalary()*0.21;
				} else if (employeeSalary >=45000 && employeeSalary < 80000)  {
					pf=employee.getEmpSalary()*0.25;
				}
				else if (employeeSalary >=80000)
				{
					pf=employee.getEmpSalary()*0.27;
				}
			
			   employee.setTa(ta);
			   employee.setDa(da);
			   employee.setHra(hra);
			   employee.setPf(pf);
			   grossSalary=employee.getEmpSalary()+ ta+da+hra;
			    netSalary=grossSalary-pf;
			   employee.setGrossSalary(grossSalary);
			   employee.setNetSalary(netSalary);
					
			return employeeRepository.save(employee);
		
		}
		return null;
	}

	@Override
	public EmployeSalary getEmployee(long employeeID) {
		Optional<EmployeSalary> employee=employeeRepository.findById(employeeID);
		return employee.orElse(null);
	}

	@Override
	public List<EmployeSalary> getAllEmployee() {		
		return employeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(long employeeID) {		
		employeeRepository.deleteById(employeeID);

	}

}
