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
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String gender;
    @Column
    private int age;
    @Column
    private String address;
    @Column
    private String email;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private JobDepartment department;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;
    @Column
    private boolean isDeleted;

    public Employee() {
        this.isDeleted = false;
    }
}
