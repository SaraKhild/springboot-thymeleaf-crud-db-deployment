package com.example.springbootthymeleafcruddbproject.service;

import com.example.springbootthymeleafcruddbproject.entity.Employee;

import java.util.List;

public interface EmployeeSerivce {

    public List<Employee> findAll ();
    public Employee findById (int id);
    public void save(Employee employee);
    public void deleteById(int id);

}
