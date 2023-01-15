package com.greatlearning.employeemanagementsystem.service;

import java.util.List;

import com.greatlearning.employeemanagementsystem.entity.Employee;

public interface EmployeeService {

	List<Employee> viewAllEmployees();

	Employee addEmployee(Employee employee);

	Employee getEmployeeById(int employeeId);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(int employeeId);

}