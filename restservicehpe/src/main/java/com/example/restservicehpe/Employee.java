package com.example.restservicehpe;

public class Employee {
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String title;
    
    public Employee(){}

    public Employee(int id, String fname, String lname, String email, String title){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.title = title;
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
    
    public String getTitle(){
        return title;
    }

    //Setter methods
    public void setId(int id){
        this.id = id;
    }

    public void setFirstName(String fname){
        this.fname = fname;
    }

    public void setLastName(String lname){
        this.lname = lname;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
