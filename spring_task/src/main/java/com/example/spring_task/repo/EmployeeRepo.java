package com.example.spring_task.repo;

import com.example.spring_task.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  EmployeeRepo  extends JpaRepository<Employee, Integer> {


    List<Employee> findByDepartment(String department);
}
