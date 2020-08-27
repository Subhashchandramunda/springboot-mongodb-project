package org.dxc.monogodb.service;


import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.dxc.monogodb.model.Employee;
import org.dxc.monogodb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(List<Employee> employee) {
		// TODO Auto-generated method stub
		
		
		employeeRepository.saveAll(employee);
		
	}

	@Override
	public Collection<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		Collection<Employee> colletction=employeeRepository.findAll();
		return colletction;
	}

	@Override
	public Optional<Employee> findEmployeeById(double employeeId) {
		// TODO Auto-generated method stub
		Optional<Employee> optional=employeeRepository.findById(employeeId);
		return optional;
	}

	@Override
	public void deleteEmployeeById(double employeeId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeId);	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub		
		employeeRepository.save(employee);
	}
	
}
