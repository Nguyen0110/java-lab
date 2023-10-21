/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author Quắn
 */
public interface Iinput {
    public abstract HashMap<String, List<Integer>> getNumber(String input);
    public abstract HashMap<String, StringBuilder> getCharacter(String input);
}