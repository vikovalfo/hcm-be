package com.vikovalfo.hcm_be.repositories;

import com.vikovalfo.hcm_be.models.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Long> {
}
