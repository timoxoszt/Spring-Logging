package com.likelion.springlogging.service.Imp;

import com.likelion.springlogging.dto.EmployeeDto;
import com.likelion.springlogging.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    EmployeeDto employeeDto;
    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto){
        return employeeDto;
    }
}
