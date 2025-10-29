package com.vikovalfo.hcm_be.services;

import com.vikovalfo.hcm_be.models.Employee;
import com.vikovalfo.hcm_be.models.dtos.EmployeeDto;
import com.vikovalfo.hcm_be.models.mappers.EmployeeDtoToEmployeeMapper;
import com.vikovalfo.hcm_be.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createNewEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeDtoToEmployeeMapper.transform(employeeDto);
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.get();
    }
}
