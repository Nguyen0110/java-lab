
import controller.Program;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Quắn
 */
public class Main1 {
    public static void main(String[] args) {
        String mChon [] = {"Add", "Find and Sort", "Update and Delete","Report","Exit"};
        Program pr = new Program("Main Menu", mChon);
        pr.run();
    }
}
