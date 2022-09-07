package com.likelion.springlogging.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class DepartmentDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer departmentId;

    @NotEmpty(message = "Department's name cannot be empty")
    @Size(min = 10, message = "{validation.name.size.too_short}")
    @Size(max = 50, message = "{validation.name.size.too_long}")
    private String deptName;

    @NotEmpty(message = "Description cannot be empty")
    private String description;

    @NotEmpty(message = "Input cannot be empty")
    private List<EmployeeDto> employeeDtoList;
}
