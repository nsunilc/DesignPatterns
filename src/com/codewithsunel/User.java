package com.codewithsunel;

public class User {
    //fields
    public String name;

    //constructor
    public User(String name){
        this.name = name;
    }

    //method
    public void sayHello(){
        System.out.println("Hi, my name is: " +name);
    }

}
