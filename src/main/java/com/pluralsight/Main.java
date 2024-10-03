package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        String Firstname;
        String Middlename;
        String LastName;
        String FullName;
        String Suffix;


        System.out.println("Please enter your Name");
        System.out.println("First name:");
        Firstname = reader.nextLine();
        System.out.println("Middle name (If provided please enter initial only followed by comma):");
        Middlename = reader.nextLine();

        System.out.println("Last name:");
        LastName = reader.nextLine();
        System.out.println("Suffix:");
        Suffix = reader.nextLine();

        String Fullname = SpaceEraser(Firstname, Middlename, LastName, Suffix);
        System.out.println(Fullname);



        System.out.println(Fullname.trim());
        reader.close();


    }

    private static String SpaceEraser(String Firstname, String Middlename, String Lastname, String Suffix){
        StringBuilder Fullname = new StringBuilder(Firstname);

        if (Middlename.isEmpty()){
            Fullname.append(" ").append(Middlename);
        }
        Fullname.append(Lastname);

        if (!Suffix.isEmpty()){
            Fullname.append(" ").append(Suffix);
        }
        return Fullname.toString();
    }
}