/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import view.Menu;

/**
 *
 * @author Quắn
 */
public class Program extends Menu<Number> {
    protected Algorithm alg;

    public Program(String td, String[] mc) {
        super(td, mc);
        alg = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                alg.inputBase();
                break;
            case 2:
                System.exit(0);
        }
    }

}
