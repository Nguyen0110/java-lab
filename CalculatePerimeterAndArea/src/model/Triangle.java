/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Quắn
 */
public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(){
        
    }
    public Triangle(Double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPrimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public double getArea() {
        double nuaChuVi = (sideA + sideB + sideC) / 2;
        return Math.sqrt((nuaChuVi - sideA) *
                (nuaChuVi - sideB) *
                (nuaChuVi - sideC) *
                nuaChuVi);
    }

    @Override
    public void printResult() {
        System.out.println("Side A: " + this.sideA);
        System.out.println("Side B: " + this.sideB);
        System.out.println("Side C: " + this.sideC);
        System.out.println("Perimeter: " + getPrimeter());
        System.out.println("Area: " + getArea());
    }

}
