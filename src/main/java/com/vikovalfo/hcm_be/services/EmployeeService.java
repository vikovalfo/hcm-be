package com.vikovalfo.hcm_be.services;

import com.vikovalfo.hcm_be.domain.services.DomainServiceImpl;
import com.vikovalfo.hcm_be.models.Employee;
import com.vikovalfo.hcm_be.repositories.EmployeeRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends DomainServiceImpl<Employee, Long> {
    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService(CrudRepository<Employee, Long> repository) {
        super(repository);
    }

    @Transactional
    public void delete(Long id) {
        employeeRepository.softDelete(id);
    }
}
