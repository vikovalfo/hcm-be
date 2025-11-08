package com.vikovalfo.hcm_be.services;

import com.vikovalfo.hcm_be.domain.services.DomainServiceImpl;
import com.vikovalfo.hcm_be.models.JobDepartment;
import com.vikovalfo.hcm_be.repositories.JobDepartmentRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class JobDepartmentService extends DomainServiceImpl<JobDepartment, Long> {
    @Autowired
    private JobDepartmentRepository jobDepartmentRepository;

    public JobDepartmentService(CrudRepository<JobDepartment, Long> repository) {
        super(repository);
    }

    @Transactional
    public void delete(Long id) {
        jobDepartmentRepository.softDelete(id);
    }
}
