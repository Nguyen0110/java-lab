/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Quắn
 */
public class Number {
    private int decimalNumber;
    private String binaryNumber;
    private String hexNumber;

    public Number() {

    }

    public Number(int decimalNumber, String binaryNumber, String hexNumber) {
        this.decimalNumber = decimalNumber;
        this.binaryNumber = binaryNumber;
        this.hexNumber = hexNumber;
    }

    public int getDecimalNumber() {
        return decimalNumber;
    }

    public void setDecimalNumber(int decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    public String getBinaryNumber() {
        return binaryNumber;
    }

    public void setBinaryNumber(String binaryNumber) {
        this.binaryNumber = binaryNumber;
    }

    public String getHexNumber() {
        return hexNumber;
    }

    public void setHexNumber(String hexNumber) {
        this.hexNumber = hexNumber;
    }

    @Override
    public String toString() {
        return "Number [decimalNumber=" + decimalNumber + ", binaryNumber=" + binaryNumber + ", hexNumber=" + hexNumber
                + "]";
    }

}
