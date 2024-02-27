package com.trungtd.employeeservice.service;

import com.trungtd.employeeservice.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployeeByDepartmentId(Long departmentId);
}
