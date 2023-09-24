/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import common.Algorithm;
import java.util.ArrayList;
import view.Menu;
import model.Student;
/**
 *
 * @author Quắn
 */
public class Program extends Menu<Student> {
    protected Algorithm alg;
    protected ArrayList<Student> stdList = new ArrayList<>();

    public Program(String title, String[] mc) {
        super(title, mc);
        alg = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                alg.addStudentList(stdList);
                break;
            case 2:
                alg.findAndSort(stdList);
                break;
            case 3:
                alg.updateAndDelete(stdList);
                break;
            case 4:
                alg.report(stdList);
                break;
            case 5:
                System.exit(0);
        }
    }

}