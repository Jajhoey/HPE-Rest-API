package com.example.restservicehpe;

public class Employee {
    private int id;
    private String fname;
    private String lname;
    private String email;

    public Employee(){}

    public Employee(int id, String fname, String lname, String email){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    //Get methods for employee object
    public int getId(){
        return id;
    }

    public String getFirstName(){
        return fname;
    }

    public String getLastName(){
        return lname;
    }

    public String getEmail(){
        return email;
    }

    //Setter methods
    public void setId(int id){
        this.id = id;
    }

    public void setFirstName(String fname){
        this.fname = fname;
    }

    public void setId(String lname){
        this.lname = lname;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
