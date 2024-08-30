package com.example.employeemanagementsystem.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private Long departmentId;  // This field represents the department ID
}
