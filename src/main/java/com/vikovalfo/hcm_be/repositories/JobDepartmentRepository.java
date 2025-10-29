package com.vikovalfo.hcm_be.repositories;

import com.vikovalfo.hcm_be.models.JobDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDepartmentRepository extends JpaRepository<JobDepartment, Long> {
}
