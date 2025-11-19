package com.vikovalfo.hcm_be.controllers;

import com.vikovalfo.hcm_be.domain.controllers.DomainController;
import com.vikovalfo.hcm_be.domain.services.DomainService;
import com.vikovalfo.hcm_be.models.Employee;
import com.vikovalfo.hcm_be.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController extends DomainController<Employee, Long> {
    
    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(DomainService<Employee, Long> service) {
        super(service);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        employeeService.delete(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
