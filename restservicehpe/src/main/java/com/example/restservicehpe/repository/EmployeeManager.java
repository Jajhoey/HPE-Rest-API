package com.example.restservicehpe.repository;

import com.example.restservicehpe.entity.Employee;
import com.example.restservicehpe.services.Employees;

import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public class EmployeeManager implements demoRepo{

    boolean existsById(Integer id);

    List<Employee> findAll();

    public void save(){
        
    }
}
