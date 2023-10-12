/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.WorkerProgram;
/**
 *
 * @author Quắn
 */
public class Main {
    public static void main(String[] args) {
        String mChon[] = { "Add ", "Increase salary", "Decrease salary", "Display", "Exit" };
        WorkerProgram wp = new WorkerProgram("Worker Management", mChon);
        wp.run();
    }

}
