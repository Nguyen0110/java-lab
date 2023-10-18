/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Comparator;
/**
 *
 * @author Quắn
 */
public class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getName().compareTo(student2.getName());
        }
    }
