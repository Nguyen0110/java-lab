
import controller.Program;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Quắn
 */
public class main {
    public static void main(String[] args) {
        String mChon[] = {"Add File","Convert","Display","Exit"};
        Program pr = new Program("|Main Menu|",mChon);
        pr.run();
    }
}
