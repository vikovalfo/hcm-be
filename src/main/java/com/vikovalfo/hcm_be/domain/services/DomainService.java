package com.vikovalfo.hcm_be.domain.services;

public abstract interface DomainService<T, ID> {
    Iterable<T> getAll();

    T get(ID id);

    T create(T entity);

    T update(ID id, T entity);

    void delete(ID id);
}
