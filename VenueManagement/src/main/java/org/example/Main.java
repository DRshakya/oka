package org.example;

import com.sun.security.jgss.GSSUtil;
import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("Welcome to Venue Management System");
        System.out.println("Press as per following");
        System.out.println("a. Book venue");
        System.out.println("b. View booked venue");
        System.out.println("c. Edit venue");
        System.out.println("d. Delete venue");
        System.out.print("Enter what you want to do:  ");
        Scanner inp = new Scanner(System.in);
        String option = inp.nextLine();
        System.out.println("You selected: "+ option);
        switch (option){
            case "a":
                System.out.println("You can do now Book Venue");
                m.create();
                break;

            case "b":
                System.out.println("You can do now View  Booked Venue");
                break;

            case "c":
                System.out.println("You can do now Book Venue");
                break;

            case "d":
                System.out.println("You can do now delete Venue");
                break;
        }

    }

    public void create(){

    }
    public void repeate(){
        System.out.println("Do you want to perform operation again?");

    }
}