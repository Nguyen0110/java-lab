/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.text.*;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author Quắn
 */
public class Validation {
    private Scanner SCANNER;

    public Scanner getScanner() {
        if (SCANNER == null) {
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }

    public int getInt() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (input.matches("^[\\d]+")) {
                break;
            }
        }
        return Integer.parseInt(input);
    }

    public String getYN() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (input.matches("^[YyNn]")) {
                break;
            }
        }
        return input;
    }

    public String getAccountNumber(String title, String error) {
        String input;
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (input.matches("^\\d{10}$")) {
                break;
            } else {
                System.err.println(error);
            }
        }
        return input;
    }

    public String getPassword(String title, String error) {
        String input;
        Pattern pt = Pattern.compile("(?=.*[0-9])(?=.*[a-zA-Z])(?=\\S+$).{8,31}");
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (pt.matcher(input).matches()) {
                break;
            } else {
                System.err.println(error);
            }
        }
        return input;
    }

    public String getString(String title) {
        String pattern = "[a-zA-Z0-9\\s]+";
        String input;
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (input.matches(pattern)) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        return input;
    }

}
