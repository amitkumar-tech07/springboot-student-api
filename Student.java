package com.example.studentapi;

public class Student {

    private int id;
    private String name;
    private String email;

    // Non-Parameterized Constructor
   // public Student(){ }

    // Parameterized Constructor
    public Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void  setEmail(String email){
        this.email = email;
    }
}
