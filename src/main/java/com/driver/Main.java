package com.driver;

public class Main {
    public static void main(String[] args) {
        // write your code here
        RWOnly obj = new RWOnly();
        //obj.name = "kiran"; // This will cause an error

        // Trying to print the value of name
        // System.out.println(obj.name);
        //Error
        obj.setName("kiran");


        System.out.println(obj.getName());
    }
  
}