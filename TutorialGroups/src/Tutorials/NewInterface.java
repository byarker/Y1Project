/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials;

/**
 *
 * @author byarker1
 */

import java.awt.*;
import javax.swing.*;

public class NewInterface extends JFrame{
    public NewInterface(){
        
        //Setting up frame
        super("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 500, 500);
        
        //Container: Insert
        JPanel panelInsert = new JPanel();
        panelInsert.setBounds(10, 100, getWidth(), 300);
        add(panelInsert);
        
        //Label: Insert
        JLabel labelInsert = new JLabel("Insert: ");
        labelInsert.setAlignmentX(this.getWidth()/2);
        labelInsert.setAlignmentY(100);
        panelInsert.add(labelInsert);
        
        //Button: Insert tutor
        JButton buttonInsertTutor = new JButton("Tutor");
        buttonInsertTutor.setBounds(10, 50, 50, 20);
        panelInsert.add(buttonInsertTutor);
        
        //Button: Insert tutor group
        JButton buttonInsertGroup = new JButton("Tutor Group");
        buttonInsertGroup.setBounds(10, 50, 50, 20);
        panelInsert.add(buttonInsertGroup);
        
        //Button: Insert student
        JButton buttonInsertStudent = new JButton("Student");
        buttonInsertStudent.setBounds(10, 50, 50, 20);
        panelInsert.add(buttonInsertStudent);
        
        //Show frame
        setVisible(true);
    }
    
    public static void main(String[] args) {
        NewInterface gui = new NewInterface();
    }
}
