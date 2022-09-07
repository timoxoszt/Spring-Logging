package com.likelion.springlogging.service.Imp;

import com.likelion.springlogging.dto.DepartmentDto;
import com.likelion.springlogging.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImp implements DepartmentService {
    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto){
        return departmentDto;
    }
}
