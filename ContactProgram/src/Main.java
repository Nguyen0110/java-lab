/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.ContactProgram;
import view.Input;
/**
 *
 * @author Quắn
 */
public class Main {
    public static void main(String[] args) {
        String mChon[] = { "Add a contract", "Display all Contract", "Delete a Contract", "Exit" };
        ContactProgram cp = new ContactProgram("Contact Program", mChon);
        cp.run();
    }
}
