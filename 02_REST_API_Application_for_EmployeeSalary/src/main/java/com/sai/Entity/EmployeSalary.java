package com.sai.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeSalary {
	@Id
	@Column(nullable = false,columnDefinition = "varchar(40)")
	private long employeeID;
	@Column(nullable = false,columnDefinition = "varchar(40)")
	private String empName;
	@Column(nullable = false)
	private double empSalary;
	@Column(nullable = false)
	private double ta;
	@Column(nullable = false)
	private double da;
	@Column(nullable = false)
	private double hra;
	@Column(nullable = false)
	private double pf;
	@Column(nullable = false)
	private double grossSalary;
	@Column(nullable = false)
	private double netSalary;
	
    public EmployeSalary() {
		// TODO Auto-generated constructor stub
	}

	public EmployeSalary(long employeeID, String empName, double empSalary, double ta, double da, double hra, double pf,
			double grossSalary, double netSalary) {
		super();
		this.employeeID = employeeID;
		this.empName = empName;
		this.empSalary = empSalary;
		this.ta = ta;
		this.da = da;
		this.hra = hra;
		this.pf = pf;
		this.grossSalary = grossSalary;
		this.netSalary = netSalary;
	}

	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
    

}
