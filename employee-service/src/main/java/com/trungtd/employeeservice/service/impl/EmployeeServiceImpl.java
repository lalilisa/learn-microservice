package com.trungtd.employeeservice.service.impl;


import com.trungtd.employeeservice.model.Employee;
import com.trungtd.employeeservice.repository.EmployeeRepository;
import com.trungtd.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getEmployeeByDepartmentId(Long departmentId) {
        return employeeRepository.findEmployeeByDepartmentId(departmentId);
    }
}
