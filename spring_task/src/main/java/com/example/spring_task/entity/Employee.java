package com.example.spring_task.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class Employee {
    @Id
    private int id;
    private String name;
    private String department;
}
