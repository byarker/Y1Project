/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials;

import java.sql.ResultSet;

/**
 *
 * @author byarker1
 */
public interface InterfaceCaller {
    
    void InsertStudent(String name, int uobnumber, int year, String tutorGroup);
    void InsertTutor(String name, int uobnumber);
    void InsertGroup(String groupName, int year, String tutor);
    ResultSet SelectGroup(String groupName);
    ResultSet SelectTutees(String tutor);
    
}
