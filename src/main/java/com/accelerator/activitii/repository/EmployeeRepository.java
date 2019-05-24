package com.accelerator.activitii.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accelerator.activitii.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee findByName(String name);
	
}
