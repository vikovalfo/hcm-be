package com.vikovalfo.hcm_be.services;

import com.vikovalfo.hcm_be.models.Employee;
import com.vikovalfo.hcm_be.repositories.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Employee createNewEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional
    public Employee getEmployee(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.get();
    }

    @Transactional
    public List<Employee> getEmployees() {
        List<Employee> list = employeeRepository.findAll();
        return list;
    }

    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> employeeToBeUpdated = employeeRepository.findById(id);
        employeeToBeUpdated.get().setName(employee.getName());
        Employee updatedEmployee = employeeRepository.save(employee);
        return  updatedEmployee;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
