import java.util.Scanner;

public class Objective9Lab5 {
  public static void main(String[] args) {
    // EXTREMELY LONG INPUT AT THE END! 
    //Last scanner. It's going to be a big one. Don't forget to close at correct spot.
  Scanner kb = new Scanner (System.in);

    // 2 deciamls
    double num1, num2;
    // true/false.
    boolean keepGoing = true;
    //  the usual whole number.
    int choice;
    // decimal
    double answer = 0.0;

    // Part 1: prompt the user to provide one number and store their input in num1
    // The question. First number used in menus.
    System.out.println("Please give me a number:");
    // Answer stored.  
    num1 = kb.nextInt();
    
    // Part 2:Prompt the user for another number and store their input in num2
    // The quesstion. Second number used in menus.
    System.out.println("Please give me another number:");
    // Answer stored.  
    num2 = kb.nextInt();
    
    while (keepGoing) {
        // method choice Which is in the second after next.
      printMenu();
      // question
      System.out.print("Which would you like to do? ");
      // answer.
      choice = kb.nextInt();

      switch (choice) {
      // Part 3:
      // Complete this switch, with each case calling one of the methods below,
      // then printing out the result (refer to "Expected Output" below)
      // Don't forget to account for a user accidentally inputting an invalid number!
      // selection choices.
        case 1:
          System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
          break;
        case 2:
          System.out.println("The average of " + num1 + " and " + num2 + " is: " + ((num1 + num2) / 2));
          break;
        case 3:
          System.out.println("The amount in tax collected from a purchase of " + num1 + " and " + num2 + " is: " + ((num1 + num2) * .0831));
          break;
        case 4:
          System.out.println("You've chosen to quit");
          return;
        default:
          System.out.println("Invalid selection. Please try again");



      }

    }
    // scanner close
    kb.close();

  }
    
    // method.
  public static void printMenu() {
    System.out.println();
    System.out.println("========= MENU =========");
    System.out.println("|                      |");
    System.out.println("|   1. Add Numbers     |");
    System.out.println("|   2. Find Average    |");
    System.out.println("|   3. Calculate Tax   |");
    System.out.println("|   4. Exit            |");
    System.out.println("|                      |");
    System.out.println("========================");
    System.out.println();
  }
    
    // method 2
  public static double findSum(double x, double y) {
    double sum = x + y;
    return sum;
  }
  
  // Part 4:
  // Write a method named "findAverage" that takes two doubles as parameters,
  // and returns a double that represents the average of the two parameters.
  // Use the "findSum" method as an example.
    
    // method 3
  public static double findAverage(double x, double y) {
    double average = (x + y) / 2;
    return average;
  }

  // Part 5:
  // Write a method named "calcTax" that also takes two doubles as parameters,
  // and returns a double that represents the amount of tax the user would have
  // to pay based on the total of the two parameters. Use a tax rate of 8.31%
  // (Not a grand total, just the total taxes. Refer to "Expected Output".)
    
    // method 4
  public static double calcTax(double x, double y) {
    double calcTax = (x + y) * .0831;
    return calcTax;
  }
}
  // Input for reference and check. 
// The two numbers that'll be used for the menus.
// Please give me a number: 2
//Please give me another number: 8

//========= MENU =========
//|                      |
//|   1. Add Numbers     |
//|   2. Find Average    |
//|   3. Calculate Tax   |
//|   4. Exit            |
//|                      |
//========================

//Which would you like to do? 1  Case 1
//2.0 + 8.0 = 10.0

//========= MENU =========
//|                      |
//|   1. Add Numbers     |
//|   2. Find Average    |
//|   3. Calculate Tax   |
//|   4. Exit            |
//|                      |
//========================

//Which would you like to do? 2 Case 2
//The average of 2.0 and 8.0 is: 5.0

//========= MENU =========
//|                      |
//|   1. Add Numbers     |
//|   2. Find Average    |
//|   3. Calculate Tax   |
//|   4. Exit            |
//|                      |
//========================

//Which would you like to do? 3 Case 3
//The amount in tax to be collected from a purchase of 2.0 and 8.0 is: 0.831

//========= MENU =========
//|                      |
//|   1. Add Numbers     |
//|   2. Find Average    |
//|   3. Calculate Tax   |
//|   4. Exit            |
//|                      |
//========================

//Which would you like to do? 5 default
//Invalid entry.  Please try again

//========= MENU =========
//|                      |
//|   1. Add Numbers     |
//|   2. Find Average    |
//|   3. Calculate Tax   |
//|   4. Exit            |
//|                      |
//========================

//Which would you like to do? case 4
//You've chosen to quit.
