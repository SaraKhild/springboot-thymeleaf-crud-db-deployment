package com.example.springbootthymeleafcruddbproject.service;

import com.example.springbootthymeleafcruddbproject.dao.EmployeeRepository;
import com.example.springbootthymeleafcruddbproject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeSeriveImpl implements  EmployeeSerivce{

    @Autowired
    private EmployeeRepository ER;


    @Override
    public List<Employee> findAll() {
        return ER.findAll();
    }

    @Override
    public Employee findById(int id) {

        Optional<Employee> result = ER.findById(id);
        Employee employee = null;

        if( result.isPresent())
            employee = result.get();
        else
            throw new RuntimeException("didi not find employee id:" + id);


        return employee;
    }

    @Override
    public void save(Employee employee) {
       ER.save(employee);
    }

    @Override
    public void deleteById(int id) {

        ER.deleteById(id);
    }
}
