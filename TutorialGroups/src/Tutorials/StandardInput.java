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

import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        
        //Variables
        Scanner input = new Scanner(System.in);
        String command = "";
        String target = "";

        //Welcome message
        System.out.println("University of Bradford tutor group database system.");
        System.out.println("Values to enter will be provieded in ()'s.");
        System.out.printf("Enter (create/view): ");
        while (command == "")
        {
            String temp = input.next();
            if (temp.equals("create") || temp.equals("view")) 
            {
                command = temp;
            }
            else 
            {
                System.out.print("Invalid command (create/view): ");
            }
        }
        
        if (command == "create") 
        {
            System.out.print("CREATE (tutor/group/student): ");
            while (target == "");
            {
                String temp = input.next();
                if (temp.equals("tutor") || temp.equals("group") || temp.equals("view")) 
                {
                    target = temp;
                }
                else 
                {
                    System.out.print("Invalid target (tutor/group/view): ");
                }
            }
        }
    }
}
