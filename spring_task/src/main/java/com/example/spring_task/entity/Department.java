package com.example.spring_task.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="department")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
