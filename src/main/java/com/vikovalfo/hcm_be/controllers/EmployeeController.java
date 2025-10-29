package com.vikovalfo.hcm_be.controllers;

import com.vikovalfo.hcm_be.models.Employee;
import com.vikovalfo.hcm_be.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(method = GET, path = "list-employees")
    public List<Employee> listEmployees(){
        return employeeService.getEmployees();
    }

    @RequestMapping(method = GET, path = "employee-details/{id}")
    public Employee newEmployee(@PathVariable("id") Long id){
        return employeeService.getEmployee(id);
    }

    @RequestMapping(method = POST, path = "new-employee")
    public Employee getEmployee(@RequestBody Employee employee){
        return employeeService.createNewEmployee(employee);
    }

    @RequestMapping(method = PUT, path = "update-employee/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    @RequestMapping(method = DELETE, path = "delete-employee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
