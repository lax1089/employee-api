package com.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Employee;

public interface EmployeeService extends JpaRepository<Employee, Integer>{
}
