/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.josbheet13exercise.Exercise3_TestMain2;

/**
 *
 * Created By_22343017_Abdul Hafiz
 */

public class Employee {
    // Private instance variables
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Other methods
    public double getAnnualSalary() {
        return salary * 12;
    }

    public String raiseSalary(double percentage) {
        double raiseAmount = salary * (percentage / 100);
        salary += raiseAmount;
        return "Salary raised by " + percentage + "%. New salary: " + salary;
    }

    // toString() method
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}