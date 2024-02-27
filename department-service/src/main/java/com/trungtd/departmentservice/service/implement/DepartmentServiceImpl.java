package com.trungtd.departmentservice.service.implement;

import com.trungtd.departmentservice.custom.exception.ExistsException;
import com.trungtd.departmentservice.model.Department;
import com.trungtd.departmentservice.repository.DepartmentRepository;
import com.trungtd.departmentservice.service.DepartmentService;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department addDepartment(Department department) {
//        Optional<Department> departmentOptional = Optional.ofNullable(department);
//
//        departmentOptional.ifPresent(value -> departmentRepository.save(value));
//        return departmentOptional.get();
        Optional.ofNullable(department)
                .filter(dep -> !departmentRepository.existsById(dep.getId()))
                .orElseThrow(() -> new ExistsException("Department cannot be null or already exists"));
        return department;
    }

    @Override
    public List<Department> getAllDepartment() {
        List<Department> departments = departmentRepository.findAll();
        if (!departments.isEmpty())
            return departments;
        else
            throw new NotFoundException("Khong ton tai phong ban nao torng he thong");
    }

    @Override
    public Department getDepartmentById(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow(
                () -> new com.trungtd.departmentservice.custom.exception.NotFoundException("Khong ton tai phong ban voi id=" + id)
        );
        return department;
    }
}
