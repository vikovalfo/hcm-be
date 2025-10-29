package com.vikovalfo.hcm_be.controllers;

import com.vikovalfo.hcm_be.models.dtos.EmployeeDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @RequestMapping(method = GET, path = "list-employees")
    public List<EmployeeDto> listEmployees(){
        EmployeeDto employee = new EmployeeDto("Alessa");
        List<EmployeeDto> list = new ArrayList<>();
        list.add(employee);
        return list;
    }

    @RequestMapping(method = GET, path = "employee-details")
    public EmployeeDto newEmployee(){
        return new EmployeeDto("Alessa");
    }

    @RequestMapping(method = POST, path = "new-employee")
    public EmployeeDto getEmployee(){
        return new EmployeeDto("Alessa");
    }

    @RequestMapping(method = PUT, path = "update-employee")
    public EmployeeDto updateEmployee(){
        return new EmployeeDto("Alessa");
    }

    @RequestMapping(method = DELETE, path = "delete-employee")
    public EmployeeDto deleteEmployee(){
        return new EmployeeDto("Alessa");
    }

}
