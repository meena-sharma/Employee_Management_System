package com.example.employeemanagementsystem.service;


import com.example.employeemanagementsystem.dto.DepartmentDTO;
import com.example.employeemanagementsystem.dto.EmployeeDTO;
import com.example.employeemanagementsystem.model.Department;
import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentDTO> getAllDepartments() {
        return departmentRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public ResponseEntity<DepartmentDTO> getDepartmentById(Long id) {
        return departmentRepository.findById(id)
                .map(department -> ResponseEntity.ok(convertToDTO(department)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    public DepartmentDTO createDepartment(DepartmentDTO departmentDTO) {
        Department department = new Department();
        department.setName(departmentDTO.getName());
        department = departmentRepository.save(department);
        return convertToDTO(department);
    }

    public ResponseEntity<DepartmentDTO> updateDepartment(Long id, DepartmentDTO departmentDTO) {
        if (!departmentRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        Department department = new Department();
        department.setId(id);
        department.setName(departmentDTO.getName());
        department = departmentRepository.save(department);
        return ResponseEntity.ok(convertToDTO(department));
    }

    public ResponseEntity<Void> deleteDepartment(Long id) {
        if (!departmentRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        departmentRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    private DepartmentDTO convertToDTO(Department department) {
        DepartmentDTO dto = new DepartmentDTO();
        dto.setId(department.getId());
        dto.setName(department.getName());
        dto.setEmployees(department.getEmployees() == null ? new HashSet<>() :
                department.getEmployees().stream()
                        .map(this::convertToDTO)
                        .collect(Collectors.toSet()));
        return dto;
    }

    private EmployeeDTO convertToDTO(Employee employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setEmail(employee.getEmail());
        dto.setDepartmentId(employee.getDepartment().getId());
        return dto;
    }
}
