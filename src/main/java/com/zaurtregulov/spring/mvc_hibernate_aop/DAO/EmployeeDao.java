package com.zaurtregulov.spring.mvc_hibernate_aop.DAO;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> employeeList();
}
