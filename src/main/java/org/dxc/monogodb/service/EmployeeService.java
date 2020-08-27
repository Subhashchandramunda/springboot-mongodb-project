package org.dxc.monogodb.service;



import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.monogodb.model.Employee;

public interface EmployeeService {

	public void saveEmployee(List<Employee> employee);

	public Collection<Employee> getAllEmployees();

	public Optional<Employee> findEmployeeById(double employeeId);

	public void deleteEmployeeById(double employeeId);

	public void updateEmployee(Employee employee);

	
	

	



}
