package com.example.restservicehpe;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.restservicehpe.services.Employees;
import com.example.restservicehpe.entity.Employee;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {
    private final Employees employees;
    
    public Controller(Employees e){
        this.employees = e;
    }

    //GET Methods
    @GetMapping(path = "/employees", produces = "application/json")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(employees.getEmployeeList());
    }

    @GetMapping(path = "/employees", produces = "application/json")
    public List<Employee> getAllEmployees(@RequestParam String param) {
        return employees.getEmployeeList();
    }
    
    
    
    @PostMapping(path = "/employees", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){

        //Use the num of total employees to create the new employee's id
        long id = employees.getEmployeeList().size();
        id++;

        employee.setId(id);
        employees.save(employee);

        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(employee.getId())
            .toUri();
        
        return ResponseEntity.created(location).build();


    }
    
}
