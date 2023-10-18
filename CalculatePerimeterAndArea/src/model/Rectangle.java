/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Quắn
 */
public class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle(){
        
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPrimeter() {
        return (width + length) * 2;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void printResult() {
        System.out.println("Width: " + this.width);
        System.out.println("Length: " + this.length);
        System.out.println("Perimeter: " + getPrimeter());
        System.out.println("Area: " + getArea());
    }

}
