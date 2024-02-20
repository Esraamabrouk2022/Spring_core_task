package com.example.spring_task.Service;

import com.example.spring_task.entity.Department;

import java.util.Optional;

public interface DepartmentService {
   Department findDepartmentByID(int id);
}
