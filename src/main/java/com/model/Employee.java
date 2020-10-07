package com.model;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// let's pretend this fixes the response bug
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Column(name = "id")
    @Id
    Integer id;
    this will break the build!

    @Column(name = "name")
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
