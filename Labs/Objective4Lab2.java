import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {
      // The scanner at start. Don't forget to close.
    Scanner keyboard = new Scanner(System.in);

     int num1 = 0, num2 = 0, num3 = 0;

      // The questions.
    System.out.println("Please enter the first whole number you would like to add.");
      //Answer
    num1 = keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add.");
    num2 = keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add.");
    num3 = keyboard.nextInt();

      //Double means decimals are going to be used. example 3.14.
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

      
      // The questions.
    System.out.println("Please enter the first decimal number you would like to add.");
      // Answers
    dub1 = keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add.");
    dub2 = keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add.");
    dub3 = keyboard.nextDouble();

    // Both int and deciamls will be added together.
    int intSum = num1 + num2 + num3;
    double doubleSum = dub1 + dub2 + dub3;

    // Sum of all 3 and answer.
    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + intSum);

    // Sum of all 3 and answer.
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + doubleSum);

    // Close the scanner
    keyboard.close();
  }
}