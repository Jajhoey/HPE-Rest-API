package com.example.restservicehpe;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<Employee> employees;

    //Getter and setter
    //Including a null case
    public List<Employee> getEmployeeList(){
        if(this.employees == null){
            this.employees = new ArrayList<Employee>();
        }

        return this.employees;
    }

    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }
}
