package com.vikovalfo.hcm_be.services;

import com.vikovalfo.hcm_be.models.Salary;
import com.vikovalfo.hcm_be.repositories.SalaryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryService {
    @Autowired
    private SalaryRepository salaryRepository;

    @Transactional
    public Salary createNewSalary(Salary salary) {
        return salaryRepository.save(salary);
    }

    @Transactional
    public Salary getSalary(Long id) {
        Optional<Salary> salary = salaryRepository.findById(id);
        return salary.get();
    }

    @Transactional
    public List<Salary> getSalaries() {
        List<Salary> list = salaryRepository.findAll();
        return list;
    }

    public Salary updateSalary(Long id, Salary salary) {
        Optional<Salary> salaryBeUpdated = salaryRepository.findById(id);
        salaryBeUpdated.get().setName(salary.getName());
        Salary updatedSalary = salaryRepository.save(salary);
        return  updatedSalary;
    }

    public void deleteSalary(Long id) {
        salaryRepository.deleteById(id);
    }
}
