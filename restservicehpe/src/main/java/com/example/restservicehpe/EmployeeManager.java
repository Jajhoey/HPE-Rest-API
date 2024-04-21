package com.example.restservicehpe;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
    
    private static Employees employeeList = new Employees();

    //Static block gets executed before main block 
    static {
        employeeList.getEmployeeList().add(
            new Employee(
                1, 
                "John",
                "Wick",
                "mydoggone@gmail.com"));

        employeeList.getEmployeeList().add(
            new Employee(
                2, 
                "James",
                "Murray",
                "tonightsbiggestloser@gmail.com"));
        
        employeeList.getEmployeeList().add(
            new Employee(
                3, 
                "Adam",
                "Eve",
                "godissocool@gmail.com"));
    }

    public Employees getEmployees(){
        return employeeList;
    }

    public void addEmployee(Employee employee){
        employeeList.getEmployeeList().add(employee);
    }

}
