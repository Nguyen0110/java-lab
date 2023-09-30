/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.Program;
/**
 *
 * @author Quắn
 */
public class Main {
    // -------------------------------------- 2023/09/30
    public static void main(String[] args) {
        String mChon [] = {"Superlative Equation", "Quaratic Equation","Exit"};
        Program pr = new Program("Equation Program", mChon);
        pr.run();
    }
}