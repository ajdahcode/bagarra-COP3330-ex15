/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is the username? " );
        String user = scnN.next();
        System.out.print( "What is the password? " );
        String psW = scnN.next();
        if(psW.equals("abc$123")){
            System.out.print( "Welcome!" );
        }
        else{
            System.out.print( "I don't know you." );
        }
    }
}
