package com.example.spring_task.Service;

import com.example.spring_task.entity.Employee;
import com.example.spring_task.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee findEmployeeById(int id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public List<Employee> findAllEmployeeWithDepartment(String department) {
        return employeeRepo.findByDepartment(department);
    }
}
