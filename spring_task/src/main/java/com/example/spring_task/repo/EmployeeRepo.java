package com.example.spring_task.repo;

import com.example.spring_task.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  EmployeeRepo  extends JpaRepository<Employee, Integer> {
    List<Employee> findByDepartmentName(String departmentName);
    Page<Employee> findAll(Pageable pageable);
    Page<Employee> findByNameContainingIgnoreCase(String name,Pageable pageable);
}
