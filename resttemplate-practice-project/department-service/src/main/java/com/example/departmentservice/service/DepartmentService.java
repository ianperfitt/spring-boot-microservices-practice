package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}
