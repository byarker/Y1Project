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
public abstract class Person {
    //variables
    private String name;
    private String uobNumber;

    //Getters
    public String getName() {
        return name;
    }

    public String getuobNumber() {
        return uobNumber;
    }
    
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setuobNumber(String number) {
        uobNumber = number;
    }
    
    //constructor
    public Person(String name, String uobNumber) {
        this.name = name;
        this.uobNumber = uobNumber;
    }
}
