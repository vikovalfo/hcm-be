package com.vikovalfo.hcm_be.controllers;

import com.vikovalfo.hcm_be.models.JobDepartment;
import com.vikovalfo.hcm_be.services.JobDepartmentService;
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
public class JobDepartmentController {

    @Autowired
    private JobDepartmentService jobDepartmentService;

    @RequestMapping(method = GET, path = "list-departments")
    public List<JobDepartment> listJobDepartments(){
        return jobDepartmentService.getJobDepartments();
    }

    @RequestMapping(method = GET, path = "department-details/{id}")
    public JobDepartment newJobDepartment(@PathVariable("id") Long id){
        return jobDepartmentService.getJobDepartment(id);
    }

    @RequestMapping(method = POST, path = "new-department")
    public JobDepartment getJobDepartment(@RequestBody JobDepartment department){
        return jobDepartmentService.createNewJobDepartment(department);
    }

    @RequestMapping(method = PUT, path = "update-department/{id}")
    public JobDepartment updateJobDepartment(@PathVariable("id") Long id, @RequestBody JobDepartment department){
        return jobDepartmentService.updateJobDepartment(id, department);
    }

    @RequestMapping(method = DELETE, path = "delete-department/{id}")
    public ResponseEntity<String> deleteJobDepartment(@PathVariable("id") Long id){
        jobDepartmentService.deleteJobDepartment(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
