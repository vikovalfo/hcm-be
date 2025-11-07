package com.vikovalfo.hcm_be.domain.services;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public abstract class DomainServiceImpl<T, ID> implements DomainService<T, ID> {

    private final CrudRepository<T, ID> repository;

    public DomainServiceImpl(CrudRepository<T, ID> repository) {
        this.repository = repository;
    }

    public T create(T entity) {
        return repository.save(entity);
    }

    public T get(ID id) {
        Optional<T> optional = repository.findById(id);
        if (optional.isPresent())
            return optional.get();
        else
            return null;
    }

    public Iterable<T> getAll() {
        Iterable<T> list = repository.findAll();
        return list;
    }

    public T update(ID id, T entity) {
        Optional<T> optional = repository.findById(id);
        if (optional.isPresent()) {
            T updated = repository.save(entity);
            return updated;

        } else
            return null;
    }

    public void delete(ID id) {
        repository.deleteById(id);
    }

}
