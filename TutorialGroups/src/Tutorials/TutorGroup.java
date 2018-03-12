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
public class TutorGroup {
    private String name;
    private int members;
    private int year;
    private String tutor;
    
    public String getName(){
        return name;
    }
    
    public int getMembers(){
        return members;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getTutor(){
        return tutor;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setMembers(int members){
        this.members = members;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void setTutor(String tutor){
        this.tutor = tutor;
    }
    
   public TutorGroup(String name, int members, int year, String tutor){
       this.name = name;
       this.members = members;
       this.year = year;
       this.tutor = tutor;
   }
}