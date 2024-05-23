package com.example.restservicehpe;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;
import java.net.URI;

@RestController
public class Controller {
    private final EmployeeService employeeService;

    public Controller(EmployeeService e){
        this.employeeService = e;
    }
    
    //GET Methods
     
    @GetMapping(path = "/employees", produces = "application/json")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(employeeService.getEmployeeList());
    }
    
    @GetMapping(path = "/employees", produces = "application/json")
    public List<Employee> getAllEmployees(@RequestParam String param) {
        return employeeService.getEmployeeList();
    } 
    
    @GetMapping(path = "/", produces = "application/json")
    public String testing(@RequestParam String param) {
        return "Default";
    }
    
    @PostMapping(path = "/employees", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){

        //Use the num of total employees to create the new employee's id
        long id = employeeService.getEmployeeList().size();
        id++;

        employee.setId(id);
        employeeService.save(employee);

        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(employee.getId())
            .toUri();
        
        return ResponseEntity.created(location).build();


    }
    
}
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