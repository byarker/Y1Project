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

    Connection con;
    Statement stmt;
    ResultSet rs;
    public DataBaseHandler() {

        
    }
    
    public boolean connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM pets");
            rs.next();
            System.out.println(rs.getInt("id"));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
