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
        super("Home");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelInsert = new JLabel("Insert");
        labelInsert.setAlignmentX(this.getWidth()/2);
        labelInsert.setAlignmentY(100);
        add(labelInsert);
        
        JButton buttonInsertTutor = new JButton("Tutor");
        buttonInsertTutor.setBounds(20, 50, 50, 20);
        add(buttonInsertTutor);
        
        setBounds(200, 200, 300, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        NewInterface gui = new NewInterface();
    }
}
