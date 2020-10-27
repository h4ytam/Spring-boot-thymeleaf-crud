package org.h4ytam.springBoot.service;

import java.util.List;

import org.h4ytam.springBoot.model.Employee;

public interface EmployeeService {

		List<Employee> getAllEmployees();
		void saveEmployee(Employee employee);
		Employee getEmployeeById(Long id);
		void deleteEmployeeById(long id);
}
