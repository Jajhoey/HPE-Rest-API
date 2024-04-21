package com.example.restservicehpe;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.URI;

@RestController
public class Controller {
    @Autowired
    private EmployeeManager employeeMananger;

    //GET Method
    @GetMapping(path = "/employees", produces = "application/json")
    public Employees getEmployeeList() {
        return employeeMananger.getEmployees();
    }
    
    @PostMapping(path = "/employees", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){

        //Use the num of total employees to create the new employee's id
        int id = employeeMananger.getEmployees().getEmployeeList().size();
        id++;

        employee.setId(id);
        employeeMananger.addEmployee(employee);

        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(employee.getId())
            .toUri();
        
        return ResponseEntity.created(location).build();


    }
    
}
