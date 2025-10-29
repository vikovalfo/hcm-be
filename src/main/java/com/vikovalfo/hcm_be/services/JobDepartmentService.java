package com.vikovalfo.hcm_be.services;

import com.vikovalfo.hcm_be.models.JobDepartment;
import com.vikovalfo.hcm_be.repositories.JobDepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobDepartmentService {
    @Autowired
    private JobDepartmentRepository jobDepartmentRepository;

    @Transactional
    public JobDepartment createNewJobDepartment(JobDepartment jobDepartment) {
        return jobDepartmentRepository.save(jobDepartment);
    }

    @Transactional
    public JobDepartment getJobDepartment(Long id) {
        Optional<JobDepartment> jobDepartment = jobDepartmentRepository.findById(id);
        return jobDepartment.get();
    }

    @Transactional
    public List<JobDepartment> getJobDepartments() {
        List<JobDepartment> list = jobDepartmentRepository.findAll();
        return list;
    }

    public JobDepartment updateJobDepartment(Long id, JobDepartment jobDepartment) {
        Optional<JobDepartment> jobDepartmentToBeUpdated = jobDepartmentRepository.findById(id);
        jobDepartmentToBeUpdated.get().setName(jobDepartment.getName());
        JobDepartment updatedJobDepartment = jobDepartmentRepository.save(jobDepartment);
        return  updatedJobDepartment;
    }

    public void deleteJobDepartment(Long id) {
        jobDepartmentRepository.deleteById(id);
    }
}
