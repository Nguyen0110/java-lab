/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.Scanner;
import view.Menu;
import model.Contact;
import view.Input;
import controller.ContactManagement;
/**
 *
 * @author Quắn
 */
    public class ContactProgram extends Menu<Contact> {

    Input in;
    ContactManagement cm;
    Contact con;

    public ContactProgram(String title, String[] mc) {
        super(title, mc);
        in = new Input();
        cm = new ContactManagement();
        con = new Contact();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                add();
                break;
            case 2:
                displayAll();
                break;
            case 3:
                delete();
                break;
            case 4:
                System.exit(0);
        }
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of contact: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Contact" + (i + 1));
            int id = in.inputId();
            String name = in.inputFullName();
            String group = in.inputGroup();
            String address = in.inputAddress();
            String phoneNumber = in.inputPhoneNumber();
            String firstName = in.inputFirstName();
            String lastName = in.inputLastName();
            con = new Contact(id, group, address, phoneNumber, firstName,
                    lastName);
            cm.addEle(con);
        }
    }

    public void displayAll() {
        cm.displayAll();
    }

    public void delete() {
        int id = in.inputId();
        cm.deleteEle(id);
    }
}