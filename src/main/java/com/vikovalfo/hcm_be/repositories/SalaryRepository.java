package com.vikovalfo.hcm_be.repositories;

import com.vikovalfo.hcm_be.models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
