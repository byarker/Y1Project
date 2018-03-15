/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials;

/**
 *
 * @author alex
 */
public class Student extends Person {
    //Attributes
    private int yearOfStudy;
    private String tutorGroup;
 //methods
    //getters
    public int getYOS() {
        return yearOfStudy;
    }

    public String getTG() {
        return tutorGroup;
    }
    //setters
    public void setYOS(int year) {
        yearOfStudy = year;
    }

    public void setTG(String group) {
        tutorGroup = group;
    }
    
    //constructor
    public Student(String name, String uobNumber, int year, String tutorGroup) {
        super(name, uobNumber);
        yearOfStudy = year;
        this.tutorGroup = tutorGroup;
    }
}
