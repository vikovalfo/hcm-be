package com.vikovalfo.hcm_be.repositories;

import com.vikovalfo.hcm_be.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Modifying
    @Query("UPDATE Employee e SET e.isDeleted = true WHERE e.id = ?1")
    void softDelete(Long id);
}
