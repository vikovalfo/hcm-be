package com.vikovalfo.hcm_be.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table
@Getter
@Setter
@ToString
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private boolean isDeleted;

    public Employee() {
        this.isDeleted = false;
    }
}
