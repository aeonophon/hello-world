// Class:      CS 5000/01
// Term:        Fall 2015
// Name:        Sean Kuhn
// Instructor:  Dr. Haddad
// Assignment:  1-1

//This program runs the HelloWorld program specified in Program #1 of Assignment 1

import java.util.Scanner;

public class HelloWorld {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Please enter your name: ");
      String name = s.nextLine();
      System.out.println("Hello " + name + "!");
   }
}