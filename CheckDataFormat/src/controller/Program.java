/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.Scanner;

import model.Data;
import view.*;
/**
 *
 * @author Quắn
 */
public class Program extends Menu<Data> {

    private Data da;
    private CheckDataProgram cdp;

    public Program(String td, String[] mc) {
        super(td, mc);
        da = new Data();
        cdp = new CheckDataProgram();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                doSomething();
                System.exit(0);

        }
    }

    public void doSomething() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phoneNumber: ");
        String phoneNumber = sc.nextLine();
        cdp.checkPhoneNumber(phoneNumber);
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        cdp.checkEmail(email);
        System.out.print("Enter date: ");
        String date = sc.nextLine();
        cdp.checkDate(date);
        da = new Data(phoneNumber, email, date);
        cdp.writeFile(phoneNumber, email, date);
        cdp.readFile();
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}