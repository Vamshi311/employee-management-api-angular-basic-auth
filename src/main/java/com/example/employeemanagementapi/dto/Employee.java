package com.example.employeemanagementapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

	private String empId;
	private String name;
	private String designation;
	private double salary;
}
