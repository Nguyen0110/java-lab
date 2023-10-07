
import controller.AccountProgram;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Quắn
 */
public class main {

    // ---------------------- 2023/10/06
    public static void main(String[] args) {
        String mChon[] = { "Create a new Account", "Login", "Exit" };
        AccountProgram ap = new AccountProgram("USER MANAGEMENT SYSTEM", mChon);
        ap.run();
    }
}