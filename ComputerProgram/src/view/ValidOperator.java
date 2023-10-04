/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Quắn
 */
public class ValidOperator {
    // -------------------------- Check operator
    public boolean isValidOperator(String input) {
        String regex = "^[+\\-*/=^]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    // -------------------------- Input operator
    public String inputOperator() {
        String operator = "";
        while (!isValidOperator(operator)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter operator: ");
            operator = sc.nextLine();
            if (!isValidOperator(operator)) {
                System.out.print("Invalid input just (+, - , *, /)!");
            }
        }
        return operator;
    }

    public static void main(String[] args) {
        ValidOperator val = new ValidOperator();
        val.inputOperator();
    }
}
