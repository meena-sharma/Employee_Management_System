package com.example.employeemanagementsystem.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class DepartmentDTO {

    private Long id;
    private String name;
    private Set<EmployeeDTO> employees = new HashSet<>(); // Initialize to avoid null
}
