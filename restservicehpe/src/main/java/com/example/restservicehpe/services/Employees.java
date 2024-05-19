package com.example.restservicehpe.services;

import com.example.restservicehpe.repository.EmployeeRepo;
import com.example.restservicehpe.entity.Employee;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Employees {
    
    private final EmployeeRepo employeeRepo;

    public Employees(EmployeeRepo repo){
        this.employeeRepo = repo;
    }

    //Getter and setter
    //Including a null case
    public List<Employee> getEmployeeList(){
        System.out.println(employeeRepo.findAll());

        return this.employeeRepo.findAll();
    }

    public void save(Employee e){
        employeeRepo.save(e);
    }

    public void init(){
        this.save(
            new Employee(
                1, 
                "John",
                "Wick",
                "mydoggone@gmail.com",
                "Dr."));
        this.save(
            new Employee(
                2, 
                "James",
                "Murray",
                "tonightsbiggestloser@gmail.com",
                "Colonel"));
        
        this.save(
            new Employee(
                3, 
                "Adam",
                "Eve",
                "godissocool@gmail.com",
                "Pastor"));
    }
}
