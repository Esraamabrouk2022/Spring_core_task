package com.example.spring_task.Service;

import com.example.spring_task.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee>  findAllEmployee();
    Employee findEmployeeById(int id);
    List<Employee> findAllEmployeeWithDepartment(String department);

}
