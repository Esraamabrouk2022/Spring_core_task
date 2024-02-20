package com.example.spring_task.Service;

import com.example.spring_task.entity.Department;
import com.example.spring_task.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Department findDepartmentByID(int id) {
        return departmentRepo.findById(id).orElse(null);
    }
}
