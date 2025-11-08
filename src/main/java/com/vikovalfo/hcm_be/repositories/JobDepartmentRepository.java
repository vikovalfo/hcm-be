package com.vikovalfo.hcm_be.repositories;

import com.vikovalfo.hcm_be.models.JobDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDepartmentRepository extends JpaRepository<JobDepartment, Long> {
    @Modifying
    @Query("UPDATE JobDepartment j SET j.isDeleted = true WHERE j.id = ?1")
    void softDelete(Long id);
}
