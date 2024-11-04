package com.example.springbootthymeleafcruddbproject.dao;

import com.example.springbootthymeleafcruddbproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
