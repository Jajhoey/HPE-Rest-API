package com.example.restservicehpe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;

//Class used to load static data since there is no db to connect to
@Configuration
public class LoadData {

    private final static Logger log = LoggerFactory.getLogger(LoadData.class);

    @Bean
    CommandLineRunner initData(EmployeeRepo employeeRepository){
        return args -> {
            log.info("Preloading employee: " + employeeRepository.save(new Employee(
                1, 
                "John",
                "Wick",
                "mydoggone@gmail.com",
                "Dr.")));

            log.info("Preloading employee: " + employeeRepository.save(new Employee(
                2, 
                "James",
                "Murray",
                "tonightsbiggestloser@gmail.com",
                "Colonel")));  

            log.info("Preloading employee: " + employeeRepository.save(new Employee(
                3, 
                "Adam",
                "Eve",
                "godissocool@gmail.com",
                "Pastor")));
        };

    }
        

}
 