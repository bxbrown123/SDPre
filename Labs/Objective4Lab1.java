      import java.util.Scanner;

public class Objective4Lab1 {
      public static void main(String[] args) {
            // First must set up a series of "Questions and answsers"



            // Setting up scanner. DO NOT FORGET TO CLOSE BEFORE ENDING BRACES (curly brackets)
      Scanner keyboard = new Scanner(System.in);

            // Print question. 1
      System.out.println("What is your first name?");

            // Keyboard response. 1
      String fname = keyboard.nextLine();

            // Print question. 2
      System.out.println("What is your last name?");

            // Keyboard response. 2
      String lname = keyboard.nextLine();

            // Print question. 3
      System.out.println("What is your favorite animal?");

            // Keyboard response. 3
      String favoriteAnimal = keyboard.nextLine();

            // Print question. 4
      System.out.println("What is your favorite food?");

            // Keyboard response. 4
      String favoriteFood = keyboard.nextLine();

            // Print question. 5
      System.out.println("What is your favorite song?");

            // Keyboard response. 5
      String favoriteSong = keyboard.nextLine();


      //  Now after getting the above answers here we must input answer with printed statements.
      //  The first set of "" is the beginning. Next with the above answer in the middle with " + and +" before and after.
      //  Don't forget ending puntuation with ".?!".
      System.out.println("My name is " + fname + " " + lname + ".");
      System.out.println("My favorite animal is the " + favoriteAnimal + ".");
      System.out.println("My favorite food is " + favoriteFood + ".");
      System.out.println("My favorite song is " + favoriteSong + ".");

      keyboard.close(); // Must end use of scanner here.

       }
}  
