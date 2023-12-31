/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Validation {

    public String inputString(String title) {
        String s = "";
        while (s.isBlank() || s.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.print(title + ": ");
            s = sc.nextLine();
        }
        return s;
    }

    public int inputInt(String title, int min, int max) {
        System.out.print(title + ": ");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            try {
                int number = Integer.parseInt(s);
                if (number < min || number > max) {
                    System.err.print("Please input number between " + min + " - " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.err.println("Please input an integer number: ");
            }
        }
    }
    
    public double inputDouble(String title, double min) {
        System.out.print(title + ": ");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            try {
                double number = Double.parseDouble(s);
                if (number < min) {
                    System.err.print("Please input nunmber >" + min + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.err.println("Please input an integer number: ");
            }
        }
    }

    
}