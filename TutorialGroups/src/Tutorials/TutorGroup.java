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

//unused in final build.
public class TutorGroup {
    //attributes
    private int groupId; // Needed for Database Stuffs. (Modified by Aaron)
    private String name;
    private int members;
    private int year;
    private String tutor;
  //methods
    //getters
    public int getGroupId(){
        return groupId;
    }
    
    public String getName() {
        return name;
    }

    public int getMembers() {
        return members;
    }

    public int getYear() {
        return year;
    }

    public String getTutor() {
        return tutor;
    }
    //setters
    public void setGroupId(int groupId){
        this.groupId = groupId;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    //constructor
    public TutorGroup(String name, int year, String tutor) {
        this.name = name;
        this.year = year;
        this.tutor = tutor;
    }
}
