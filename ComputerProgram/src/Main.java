/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.ComputerProgram;
/**
 *
 * @author Quắn
 */
public class Main {
    public static void main(String[] args) {
        String mChon[] = { "Normal Calcutor", "BMI Calculator", "Exit" };
        ComputerProgram cp = new ComputerProgram("Calculator Program", mChon);
        cp.run();
    }
}
