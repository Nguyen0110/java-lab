/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.Scanner;
/**
 *
 * @author Quắn
 */
 public class ValidNumber {
    // ---------------------- isValidNumber
    public boolean isValidDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // ---------------------- inputNumber
    public double inputDouble() {
        double number = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (isValidDouble(input)) {
                number = Float.parseFloat(input);
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        return number;
    }
}