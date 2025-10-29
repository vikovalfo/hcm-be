package com.vikovalfo.hcm_be.services;

import com.vikovalfo.hcm_be.models.Payroll;
import com.vikovalfo.hcm_be.repositories.PayrollRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayrollService {
    @Autowired
    private PayrollRepository payrollRepository;

    @Transactional
    public Payroll createNewPayroll(Payroll payroll) {
        return payrollRepository.save(payroll);
    }

    @Transactional
    public Payroll getPayroll(Long id) {
        Optional<Payroll> payroll = payrollRepository.findById(id);
        return payroll.get();
    }

    @Transactional
    public List<Payroll> getSalaries() {
        List<Payroll> list = payrollRepository.findAll();
        return list;
    }

    public Payroll updatePayroll(Long id, Payroll payroll) {
        Optional<Payroll> payrollBeUpdated = payrollRepository.findById(id);
        payrollBeUpdated.get().setName(payroll.getName());
        Payroll updatedPayroll = payrollRepository.save(payroll);
        return  updatedPayroll;
    }

    public void deletePayroll(Long id) {
        payrollRepository.deleteById(id);
    }
}
