package com.vikovalfo.hcm_be.models.dtos;

public class EmployeeDto {
    private String name;

    public EmployeeDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
