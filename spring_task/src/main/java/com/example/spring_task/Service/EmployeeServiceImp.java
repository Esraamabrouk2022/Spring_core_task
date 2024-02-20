package com.example.spring_task.Service;

import com.example.spring_task.entity.Employee;
import com.example.spring_task.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public List<Employee> findAllEmployeeByDepartmentName(String departmentName) {
        return employeeRepo.findByDepartmentName(departmentName);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Page<Employee> findAllEmployees(Pageable pageable) {
        return employeeRepo.findAll(pageable);
    }

    @Override
    public Page<Employee> findAllEmployeesByName(String name,Pageable pageable) {
        return employeeRepo.findByNameContainingIgnoreCase(name,pageable);
    }


}
