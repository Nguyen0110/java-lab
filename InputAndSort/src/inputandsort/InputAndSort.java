/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputandsort;
import controller.Program;
/**
 *
 * @author Quắn
 */
public class InputAndSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mChon[] = {"Add list student", "Display","Exit"};
        Program pr = new Program("Collection Sort Program",mChon);
        pr.run();
    }
    
}
