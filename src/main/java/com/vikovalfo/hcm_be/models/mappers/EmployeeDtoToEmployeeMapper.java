package com.vikovalfo.hcm_be.models.mappers;

import com.vikovalfo.hcm_be.models.Employee;
import com.vikovalfo.hcm_be.models.dtos.EmployeeDto;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDtoToEmployeeMapper {
    public static Employee transform(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setName(employeeDto.getName());
        return employee;
    }
}
