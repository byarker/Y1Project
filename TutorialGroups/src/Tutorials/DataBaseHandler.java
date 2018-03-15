/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Shadow
 */
public class DataBaseHandler {
    /*
    Untested and might not even work, i'll do comments tomorrow stuffs.
    Note: This only sents and retrives data from the database,
    if you want to process that data locally it'll have to be done elsewhere.
    ¯\_(ツ)_/¯ Someone else can do that while I hunt down a database.
    Also if you read this before 1pm tomorrow, and we're still going to be in at 1pm tomorrow.
    I will likely be in, that way I'm not in for half an hour if we get nothing new in cass

    */
    Connection con;
    Statement stmt;
    
    private boolean connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/test");
            stmt = con.createStatement();
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    private boolean disconnect() {
        if (stmt != null) {
            try {
                stmt.close();
                con.close();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            

        } else if (con != null) {
            try {
                con.close();
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }return false;
    }
    private ResultSet readQuery(String query){
        ResultSet tempResults = null;
        try{
            connect();
            tempResults = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            disconnect();
        }
        return tempResults;        
    }
    private void updateQuery(String query){
        try{
            connect();
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            disconnect();
        }
    }
    public ResultSet selectStudent(String searchterm){
        String query = "SELECT * FROM students WHERE '" + searchterm + "' IN (name,uobnumber,yearofstudy,tutorgroup)";
        return readQuery(searchterm);
        
    }
    
    public ResultSet selectTutor(String searchterm){
        String query = "SELECT * FROM tutors WHERE '%" + searchterm + "%' IN (name,uobnumber)";
        return readQuery(searchterm);
        
    }
    
    public ResultSet selectGroup(String searchterm){
        String query = "SELECT * FROM tutorGroups WHERE '%" + searchterm + "%' IN (name,members,year,tutor)";
        return readQuery(searchterm);
        
    }
    
    public void insertStudent(Student student){
        String name = student.getName();
        String uobn = student.getuobNumber();
        int yos = student.getYOS();
        String tg = student.getTG();
        
        String query = "INSERT INTO students(name, uobnumber, yearofstudy, tutorgroup) VALUES ('" + name + "','" + uobn + "','" + yos + "','" + tg + "')";
        updateQuery(query);
    }
    public void insertTutor(Tutor tutor){
        String name = tutor.getName();
        String uobn = tutor.getuobNumber();
        
        String query = "INSERT INTO tutors(name, uobnumber) VALUES ('" + name + "','" + uobn + "')";
        updateQuery(query);
    }
    public void insertGroup(TutorGroup tutorGroup){
        String name = tutorGroup.getName();
        int members = tutorGroup.getMembers();
        int year = tutorGroup.getYear();
        String tutor = tutorGroup.getTutor();
        
        String query = "INSERT INTO tutorgroups(name, members, year, tutor) VALUES ('" + name + "','" + members + "','" + year + "','" + tutor + "')";
        updateQuery(query);
    }
    
    public void editStudent(Student student){
        String name = student.getName();
        String uobn = student.getuobNumber();
        int yos = student.getYOS();
        String tg = student.getTG();
        
        String query = "UPDATE student SET 'name' = '" + name + "', 'yearofstudy' = '" + yos + "', 'tutorgroup' = " + tg + "' WHERE uobnumber = '" + uobn;
        updateQuery(query);
    }
    public void editTutor(Tutor tutor){
        String name = tutor.getName();
        String uobn = tutor.getuobNumber();
        
        String query = "UPDATE tutor SET name = '" + name + "'WHERE uobnumber = '" + uobn;
        updateQuery(query);
    }
    
    public void editGroup(TutorGroup tutorGroup){
        int gid = tutorGroup.getGroupId();
        String name = tutorGroup.getName();
        int members = tutorGroup.getMembers();
        int year = tutorGroup.getYear();
        String tutor = tutorGroup.getTutor();
        
        String query = "UPDATE tutorgroup SET name = '" + name + "', member = '" + members + "', year = '" + year + "', tutor = '" + tutor + "' WHERE groupid = " + gid; 
        updateQuery(query);
    }
}
