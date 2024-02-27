package com.trungtd.departmentservice.service;

import com.trungtd.departmentservice.model.Department;

import java.util.List;

public interface DepartmentService {
    Department addDepartment(Department department);
    List<Department> getAllDepartment();
    Department getDepartmentById(Long id);
    //0021000429042
}
