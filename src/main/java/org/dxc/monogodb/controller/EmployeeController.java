package org.dxc.monogodb.controller;



import java.util.Collection;
import java.util.List;
import java.util.Optional;


import org.dxc.monogodb.model.Employee;
import org.dxc.monogodb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/save")
	public void saveEmployee(@RequestBody List<Employee> employee) {
		System.out.println("..............."+employee);
		employeeService.saveEmployee(employee);		
		}
	@GetMapping("/getAll")
	public Collection<Employee> getEmployees(){
		Collection<Employee> employee=employeeService.getAllEmployees();
		System.out.println("..............."+employee);
		return (Collection<Employee>) employee;
	} 
	@GetMapping("/findEmployee/{employeeId}")
	public Optional<Employee> findEmployee(@PathVariable("employeeId")double employeeId){
		return (Optional<Employee>) employeeService.findEmployeeById(employeeId);
	}
	@DeleteMapping("/deleteEmployee/{employeeId}")
	public void deleteEmployee(@PathVariable("employeeId")double employeeId) {
		employeeService.deleteEmployeeById(employeeId);
	}
	@PutMapping("/update/{employeeId}")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable("employeeId")double employeeId) {
		employee.setEmployeeId(employeeId);	   
		employeeService.updateEmployee(employee);
	}
	
}
