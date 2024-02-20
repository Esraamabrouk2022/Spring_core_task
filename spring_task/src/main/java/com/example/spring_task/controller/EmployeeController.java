package com.example.spring_task.controller;

import com.example.spring_task.Service.DepartmentService;
import com.example.spring_task.Service.EmployeeService;
import com.example.spring_task.entity.Department;
import com.example.spring_task.entity.Employee;
import com.example.spring_task.repo.DepartmentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    /*
        @GetMapping("employees")
        public List<Employee> getAllEmployees() {
            return employeeService.findAllEmployee();
        }
    */

    @GetMapping("/employees")
    public Page<Employee> getAllEmployees(Pageable pageable) {
        return employeeService.findAllEmployees((PageRequest) pageable);
    }

    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.findEmployeeById(id);
    }


    @GetMapping("employees/{departmentName}")
    public List<Employee> getEmployeesByDepartment(@PathVariable String departmentName) {
        return employeeService.findAllEmployeeByDepartmentName(departmentName);
    }

    @PostMapping("employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("search")
    public  Page<Employee> searchByName(@RequestParam String name, Pageable pageable) {
        return employeeService.findAllEmployeesByName(name,pageable);
    }

}
