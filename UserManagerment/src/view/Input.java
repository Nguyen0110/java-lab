/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.*;

/**
 *
 * @author Quắn
 */
public class Input {
    Validation val = new Validation();

    // ---------------------------- Input userName
    public String getUserName() {
        String userName = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidUserName(userName)) {
            System.out.print("Enter userName: ");
            userName = sc.nextLine();
            if (!val.isValidUserName(userName)) {
                System.out.println("You must enter least at 5 character, and no space!");
            }
        }
        return userName;
    }

    // ---------------------------- Input password
    public String getPassoWord() {
        String passWord = "";
        Scanner sc = new Scanner(System.in);
        while (!val.isValidPassWord(passWord)) {
            System.out.print("Enter passWord: ");
            passWord = sc.nextLine();
            if (!val.isValidPassWord(passWord)) {
                System.out.println("You must enter least at 6 character, and no space!");
            }
        }
        return passWord;
    }
}
