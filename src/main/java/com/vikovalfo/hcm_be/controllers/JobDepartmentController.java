package com.vikovalfo.hcm_be.controllers;

import com.vikovalfo.hcm_be.domain.controllers.DomainController;
import com.vikovalfo.hcm_be.domain.services.DomainService;
import com.vikovalfo.hcm_be.models.JobDepartment;
import com.vikovalfo.hcm_be.services.JobDepartmentService;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobDepartment")
public class JobDepartmentController extends DomainController<JobDepartment, Long> {
    
    @Autowired
    private JobDepartmentService jobDepartmentService;

    public JobDepartmentController(DomainService<JobDepartment, Long> service) {
        super(service);
    }
    
    @RequestMapping(method = DELETE, path = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        jobDepartmentService.delete(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
