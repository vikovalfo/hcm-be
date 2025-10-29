package com.vikovalfo.hcm_be.controllers;

import com.vikovalfo.hcm_be.models.Salary;
import com.vikovalfo.hcm_be.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/api")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @RequestMapping(method = GET, path = "list-salaries")
    public List<Salary> getSalaries(){
        return salaryService.getSalaries();
    }

    @RequestMapping(method = GET, path = "salary-details/{id}")
    public Salary newSalary(@PathVariable("id") Long id){
        return salaryService.getSalary(id);
    }

    @RequestMapping(method = POST, path = "new-salary")
    public Salary getSalary(@RequestBody Salary salary){
        return salaryService.createNewSalary(salary);
    }

    @RequestMapping(method = PUT, path = "update-salary/{id}")
    public Salary updateSalary(@PathVariable("id") Long id, @RequestBody Salary salary){
        return salaryService.updateSalary(id, salary);
    }

    @RequestMapping(method = DELETE, path = "delete-salary/{id}")
    public ResponseEntity<String> deleteSalary(@PathVariable("id") Long id){
        salaryService.deleteSalary(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
