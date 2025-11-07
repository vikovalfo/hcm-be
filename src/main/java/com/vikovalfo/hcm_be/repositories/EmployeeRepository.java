package com.vikovalfo.hcm_be.repositories;

import com.vikovalfo.hcm_be.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
