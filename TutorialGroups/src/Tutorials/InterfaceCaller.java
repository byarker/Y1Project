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

    void insertStudent(Student student);
    void insertTutor(Tutor tutor);
    void insertGroup(TutorGroup group);
    ResultSet selectStudent(String groupName); // should take tutor group name, and return all students in that group.
    ResultSet selectGroup(String tutor); // should take a tutor name, and return all tutor groups they run.

}
