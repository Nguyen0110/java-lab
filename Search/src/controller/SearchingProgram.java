/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;



/**
 *
 * @author pauld
 */
public class SearchingProgram extends Menu<String> {
     static String[] mc = { "Sort", " Search", "Exit" };

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchingProgram(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSizeArray();
        array = element.getArray();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                sort();
                break;
            case 2:
                search();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    public void sort() {
        System.out.println("Da lam hom thu 4");
    }

    public void search() {
        final String[] mSearching = { "Liner Searching", "Binary Searching", "Exit" };
        class SearchingMenu extends Menu<String> {
            public SearchingMenu() {
                super("Searching Menu", mSearching);
            }

            @Override
            public void execute(int n) {
                library.display(array);
                int value = library.getInt("\n Enter number to find", 1, 100);
                switch (n) {
                    case 1:
                        System.out
                                .println("Found value:" + value + " at index: " + algorithm.linerySearch(array, value));
                        break;
                    case 2:
                        System.out
                                .println("Found value:" + value + " at index: " + algorithm.binarySearch(array, value));
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        SearchingMenu sm = new SearchingMenu();
        sm.run();
    }
}
