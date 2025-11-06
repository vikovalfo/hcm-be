package com.vikovalfo.hcm_be.controllers;

import com.vikovalfo.hcm_be.domain.controllers.DomainController;
import com.vikovalfo.hcm_be.domain.services.DomainService;
import com.vikovalfo.hcm_be.models.Employee;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController extends DomainController<Employee, Long> {

    public EmployeeController(DomainService<Employee, Long> service) {
        super(service, new String[]{"employees", "employee"});
    }
}
