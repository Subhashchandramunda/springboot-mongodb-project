package org.dxc.monogodb.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="employee")
public class Employee  {
	 

	@Id	
	@Field(name="_id")
	private double employeeId;
	@Field(name="firstname")
	private String firstName;
	@Field(name="lastname")
	private String lastName;
	@Field(name="salary")
	private String salary;
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeId + ", firstname=" + firstName + ", lastname=" + lastName
				+ ", salary=" + salary + "]";
	}
	
}
