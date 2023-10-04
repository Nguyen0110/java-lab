/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.regex.*;
/**
 *
 * @author Quắn
 */
    public class Validation {
    // private int id;
    // private String fullName;
    // private String group;
    // private String address;
    // private String phoneNumber;
    // private String firstName;
    // private String lastName;

    // ------------------------ isValidId
    public boolean isVlaidId(int id) {
        if (id <= 0) {
            return false;
        }

        try {
            Integer.parseInt(String.valueOf(id));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    // ------------------------ isValidString
    public boolean isValidString(String input) {
        String regexPattern = "[A-Za-z\\s]+$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    // ----------------------- isValidPhoneNumber
    public boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^(\\d{10}|\\d{3}-\\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4} x\\d{4}|\\d{3}-\\d{3}-\\d{4} ext\\d{4}|\\(\\d{3}\\)-\\d{3}-\\d{4}|\\d{3}\\.\\d{3}\\.\\d{4}|\\d{3} \\d{3} \\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

}
