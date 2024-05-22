package com.example.restservicehpe;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{
    
    public List<Employee> getAllEmployees();

    /**
    employees.save(
            new Employee(
                1, 
                "John",
                "Wick",
                "mydoggone@gmail.com",
                "Dr."));
    employees.save(
        new Employee(
            2, 
            "James",
            "Murray",
            "tonightsbiggestloser@gmail.com",
            "Colonel"));
    
    employees.save(
        new Employee(
            3, 
            "Adam",
            "Eve",
            "godissocool@gmail.com",
            "Pastor"));
    **/

}