/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.josbheet13exercise.Exercise2_TestMain1;

/**
 *
 * Created By_22343017_Abdul Hafiz
 */

public class Rectangle {
    // Private instance variables
    private float length;
    private float width;

    // Constructors
    public Rectangle() {
        this.length = 1.0f;  // default length
        this.width = 1.0f;   // default width
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Getters and Setters
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Other methods
    public float getArea() {
        return length * width;
    }

    public float getPerimeter() {
        return 2 * (length + width);
    }

    // toString() method
    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }
}