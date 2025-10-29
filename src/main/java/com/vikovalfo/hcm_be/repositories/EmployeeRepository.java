package com.vikovalfo.hcm_be.repositories;

import com.vikovalfo.hcm_be.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EmployeeRepository implements CrudRepository<Long, Employee> {

    @Override
    public Iterable saveAll(Iterable entities) {
        return null;
    }


    @Override
    public <S extends Long> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Long> findById(Employee employee) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Employee employee) {
        return false;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Iterable findAllById(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Employee employee) {

    }

    @Override
    public void delete(Long entity) {

    }

    @Override
    public void deleteAllById(Iterable iterable) {

    }

    @Override
    public void deleteAll(Iterable entities) {

    }

    @Override
    public void deleteAll() {

    }
}
