/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import model.Data;
import view.Menu;
import view.Validation;

/**
 *
 * @author USER
 */
public class Program extends Menu<String> {

    protected Algorithm alg;
    protected Validation val;
    protected Data dt;
    public Program(String title, String[] mc) {
        super(title, mc);
        alg = new Algorithm();
        val = new Validation();
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                countChar();
                break;
            case 2:
            System.exit(0);
        }
    }

    public void countChar(){
        String input = val.isValidInput();
        Data dt = new Data(input);
        alg.countString(input);
        alg.countCharDuplicate(input);
    }
}
