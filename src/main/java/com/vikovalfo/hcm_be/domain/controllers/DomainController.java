package com.vikovalfo.hcm_be.domain.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.vikovalfo.hcm_be.domain.services.DomainService;

public abstract class DomainController<T, ID> {

    private final DomainService<T, ID> service;

    protected DomainController(DomainService<T, ID> service){
        this.service = service;
    }
     
    @GetMapping("/list")
    public Iterable<T> list() {
        return service.getAll();
    }

    @GetMapping("/details/{id}")
    public T get(@PathVariable ID id){
        return service.get(id);
    }

    @PostMapping("/new")
    public T create(@RequestBody T entity){
        return service.create(entity);
    }

    @PutMapping("/update/{id}")
    public T update(@PathVariable ID id, @RequestBody T entity){
        return service.update(id, entity);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable ID id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    
}
