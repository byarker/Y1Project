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
        labelInsert.setAlignmentX(TOP_ALIGNMENT);
        
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        NewInterface gui = new NewInterface();
    }
}
