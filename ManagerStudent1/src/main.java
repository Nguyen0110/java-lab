/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.ManagerSystem;
/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) {
        String [] mChon = {"Add Candidate","Search","Exit"};
        ManagerSystem ms = new ManagerSystem("Main Menu",mChon);
        ms.run();
    }
}
