package com.vikovalfo.hcm_be.services;

import com.vikovalfo.hcm_be.domain.services.DomainServiceImpl;
import com.vikovalfo.hcm_be.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends DomainServiceImpl<Employee, Long> {

    public EmployeeService(CrudRepository<Employee, Long> repository) {
        super(repository);
    }
}
