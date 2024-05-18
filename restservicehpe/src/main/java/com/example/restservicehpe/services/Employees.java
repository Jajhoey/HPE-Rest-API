package com.example.restservicehpe.services;

import com.example.restservicehpe.repository.EmployeeManager;
import com.example.restservicehpe.entity.Employee;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Employees {

    private final EmployeeManager employeeRepo;

    public Employees(EmployeeManager repo){
        this.employeeRepo = repo;
    }

    //Getter and setter
    //Including a null case
    public List<Employee> getEmployeeList(){
        return this.employeeRepo.findAll();
    }
}
