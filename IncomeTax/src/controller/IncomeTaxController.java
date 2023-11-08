/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.Validation;
import java.util.ArrayList;
import java.util.List;
import model.Children;
import model.Parent;
import model.Person;
import repository.IncomeTaxRepository;

/**
 *
 * @author USER
 */
public class IncomeTaxController {
    Validation valid;
    Person person;
    List<Children> childrens;
    List<Parent> parents;
    IncomeTaxRepository repo;

    public IncomeTaxController(){
        valid = new Validation();
        person =  new Person();
        childrens = new ArrayList<>();
        parents = new ArrayList<>();
        repo = new IncomeTaxRepository();
    }
    
    public void run(){
        System.out.println("========Income Tax Program=========");
        repo.inputData(person, childrens, parents);
        repo.detailOfDeduction(person, childrens, parents);
    }
}
