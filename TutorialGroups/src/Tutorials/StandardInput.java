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

import java.sql.ResultSet;
import java.util.Scanner;

public class StandardInput {
    public static void main(String[] args) {
        
        //Variables
        Scanner input = new Scanner(System.in);
        DataBaseHandler dbhandle = new DataBaseHandler();
        String command = "";
        String target = "";

        //Welcome message
        System.out.println("University of Bradford tutor group database system.");
        System.out.println("Values to enter will be provieded in ()'s.");
        System.out.printf("Enter (create/view): ");
        while (command.equals(""))
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
        
        if (command.equals("create")) 
        {
            System.out.print("CREATE (tutor/group/student): ");
            while (target.equals(""));
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
            
            if (target.equals("tutor")) 
            {
                System.out.print("Enter name: ");
                String name = input.next();
                System.out.print("Enter UOB number: ");
                String uob = input.next();
                Tutor tutor = new Tutor(name, uob);
                dbhandle.insertTutor(tutor);
            }
            if (target.equals("group")) 
            {
                System.out.print("Enter group name: ");
                String groupname = input.next();
                System.out.print("Enter group year: ");
                int year = Integer.valueOf(input.next());
                System.out.print("Enter tutor name: ");
                String tutor = input.next();
                TutorGroup group = new TutorGroup(groupname, year, tutor);
                dbhandle.insertGroup(group);
            }
            if (target.equals("student")) 
            {
                System.out.print("Enter name: ");
                String name = input.next();
                System.out.print("Enter UOB number: ");
                String uob = input.next();
                System.out.print("Enter group year: ");
                int year = Integer.valueOf(input.next());
                System.out.print("Enter group name: ");
                String group = input.next();
                Student student = new Student(name, uob, year, group);
                dbhandle.insertStudent(student);
            }
        }
        else if (command.equals("view"))
        {
            System.out.print("SELECT (group/students): ");
            while (target.equals(""));
            {
                String temp = input.next();
                if (temp.equals("group") || temp.equals("students")) 
                {
                    target = temp;
                }
                else 
                {
                    System.out.print("Invalid target (group/students): ");
                }
            }
            if (target.equals("group"))
            {
                System.out.print("Enter group name: ");
                String name = input.next();
                ResultSet set = dbhandle.selectGroup(name);
                System.out.println(set);
            }
            else if (target.equals("students"))
            {
                System.out.print("Enter tutor name: ");
                String name = input.next();
                ResultSet set = dbhandle.selectStudent(name);
                System.out.println(set);
            }
        }
    }
}
