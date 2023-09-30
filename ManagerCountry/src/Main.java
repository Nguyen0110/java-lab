/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controller.ManageEastAsiaCountry;
/**
 *
 * @author Quắn
 */
public class Main{
    
    // ----------------------- 2023/09/30
    public static void main(String[] args) {
        String mChon [] = {"Input the information of 11 countries in East Asia","Display and sort the information of country you've just input","Search the information of country by user-enterd name","Exit"};
        ManageEastAsiaCountry meac = new ManageEastAsiaCountry("Menu",mChon);
        meac.run();
    }
}
