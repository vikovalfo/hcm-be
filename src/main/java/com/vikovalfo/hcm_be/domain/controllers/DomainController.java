package com.vikovalfo.hcm_be.domain.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vikovalfo.hcm_be.domain.services.DomainService;

public abstract class DomainController<T, ID> {

    private final DomainService<T, ID> service;

    protected DomainController(DomainService<T, ID> service){
        this.service = service;
    }
     
    @RequestMapping(method = GET, path = "/list")
    public Iterable<T> list() {
        return service.getAll();
    }

    @RequestMapping(method = GET, path = "/details/{id}")
    public T get(@PathVariable("id") ID id){
        return service.get(id);
    }

    @RequestMapping(method = POST, path = "/new")
    public T create(@RequestBody T entity){
        return service.create(entity);
    }

    @RequestMapping(method = PUT, path = "/update/{id}")
    public T update(@PathVariable("id") ID id, @RequestBody T entity){
        return service.update(id, entity);
    }

    @RequestMapping(method = DELETE, path = "/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") ID id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    
}
