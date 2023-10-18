/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.DictonaryProgram;
/**
 *
 * @author Quắn
 */
public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Add","Delete","Translate","Exit"};
        DictonaryProgram dp = new DictonaryProgram("Dictonary Program", mChon);
        dp.run();
    }   
}
