package com.example.spring_task.controller;

import com.example.spring_task.Service.EmployeeService;
import com.example.spring_task.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployee();
    }

    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.findEmployeeById(id);
    }


    @GetMapping("employees/{department}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String department) {
        return employeeService.findAllEmployeeWithDepartment(department);
    }
}
