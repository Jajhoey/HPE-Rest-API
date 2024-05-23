package com.example.restservicehpe;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{}
    


