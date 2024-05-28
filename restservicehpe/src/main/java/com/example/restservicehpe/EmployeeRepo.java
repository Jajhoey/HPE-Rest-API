package com.example.restservicehpe;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long>{}
    


