/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author USER
 */
import controller.Program;


public class Main {
    public static void main(String[] args) {
        String [] mChon = {"Count","Exit"};
        Program mpr = new Program("Main Menu", mChon);
        mpr.run();
    }
}