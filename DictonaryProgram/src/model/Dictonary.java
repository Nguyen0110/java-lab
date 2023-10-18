/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Quắn
 */
public class Dictonary {
     private String englishWord;
    private String vietNameseWord;

    public Dictonary() {
    }

    public Dictonary(String englishWord, String vietNameseWord) {
        this.englishWord = englishWord;
        this.vietNameseWord = vietNameseWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getVietNameseWord() {
        return vietNameseWord;
    }

    public void setVietNameseWord(String vietNameseWord) {
        this.vietNameseWord = vietNameseWord;
    }
}
