/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.*;

import model.Country;
import model.EastAsiaCountry;
import view.Input;
/**
 *
 * @author Quắn
 */
public class Algorithm {
    static Input in = new Input();
    static Set<EastAsiaCountry> countryList = new TreeSet<>(Comparator.comparing(EastAsiaCountry::getCountryName));

    // ------------------------------- Add Country
    public void addCountry(EastAsiaCountry country) {
        countryList.add(country);
    }

    // ------------------------------ Display all
    public void display() {
        System.out.println("=========== Diplay All ============");
        for (EastAsiaCountry eastAsiaCountry : countryList) {
            System.out.println(eastAsiaCountry.toString());
        }
        System.out.println();
    }

    // ------------------------------- Searching Country
    public EastAsiaCountry searchCountry(String countryName) {
        for (EastAsiaCountry eastAsiaCountry : countryList) {
            if (countryName.equalsIgnoreCase(eastAsiaCountry.getCountryName())) {
                System.out.println(eastAsiaCountry.toString());
                return eastAsiaCountry;
            }
        }
        return null;
    }
}
