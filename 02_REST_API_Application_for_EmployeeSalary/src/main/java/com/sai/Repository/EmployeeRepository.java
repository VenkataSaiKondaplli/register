package com.sai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.Entity.EmployeSalary;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeSalary, Long> {

}
