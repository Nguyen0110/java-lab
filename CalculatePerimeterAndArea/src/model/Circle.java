/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Quắn
 */
public class Circle implements Shape {
    private double radius;
    private final double $pi = 3.14;

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPrimeter() {
        return (this.radius * 2) * $pi;
    }

    @Override
    public double getArea() {
        return $pi * Math.pow(radius, radius);
    }

    @Override
    public void printResult() {
        System.out.println("Radius: " + this.radius);
        System.out.println("Perimerter: " + getPrimeter());
        System.out.println("Area: " + getArea());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double get$pi() {
        return $pi;
    }

}