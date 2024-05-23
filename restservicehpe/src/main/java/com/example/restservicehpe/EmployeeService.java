package com.example.restservicehpe;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo repo){
        this.employeeRepo = repo;
    }

    //Getter and setter
    //Including a null case
    public List<Employee> getEmployeeList(){
        return this.employeeRepo.findAll();
    }

    public void save(Employee e){
        employeeRepo.save(e);
    }

}
