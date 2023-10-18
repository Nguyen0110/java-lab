/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;
import view.*;
/**
 *
 * @author Quắn
 */
public class CalculateProgram extends Menu<Double> {
    Validated val;
    Circle c;
    Rectangle rec;
    Triangle tri;

    public CalculateProgram(String td, String[] mc) {
        super(td, mc);
        val = new Validated();
        rec = new Rectangle();
        c = new Circle();
        tri = new Triangle();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                add();
                break;
            case 2:
                calculate();
                break;
            case 3:
                System.exit(0);
        }
    }

    public void add() {
        System.out.print("Please input side width of Rectangle: ");
        double width = val.inputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = val.inputDouble();
        rec = new Rectangle(width, length);
        System.out.print("Please input radius of Circle: ");
        double radius = val.inputDouble();
        c = new Circle(radius);
        System.out.print("Please side A of Triangle: ");
        double sideA = val.inputDouble();
        System.out.print("Please side B of Triangle: ");
        double sideB = val.inputDouble();
        System.out.print("Please side B of Triangle: ");
        double sideC = val.inputDouble();
        tri = new Triangle(sideA, sideB, sideC);
    }

    public void calculate() {
        System.out.println("---- Rectangle ----");
        rec.printResult();
        System.out.println("---- Circle ----");
        c.printResult();
        System.out.println("---- Triangle ----");
        tri.printResult();
    }

}