package com.example.spring_task.Service;

import com.example.spring_task.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployee();

    Employee findEmployeeById(int id);

    List<Employee> findAllEmployeeByDepartmentName(String department);

    Employee createEmployee(Employee employee);

    Page<Employee> findAllEmployees(Pageable pageable);

    Page<Employee> findAllEmployeesByName(String name,Pageable pageable);
}
