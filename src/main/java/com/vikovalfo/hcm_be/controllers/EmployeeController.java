package com.vikovalfo.hcm_be.controllers;

import com.vikovalfo.hcm_be.domain.controllers.DomainController;
import com.vikovalfo.hcm_be.domain.services.DomainService;
import com.vikovalfo.hcm_be.models.Employee;
import com.vikovalfo.hcm_be.services.EmployeeService;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController extends DomainController<Employee, Long> {
    
    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(DomainService<Employee, Long> service) {
        super(service, new String[] { "employees", "employee" });
    }
    
    @RequestMapping(method = DELETE, path = "delete-employee/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        employeeService.delete(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
