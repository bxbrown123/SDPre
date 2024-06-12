import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    // This will provide similar result, but obtained in a different way.
    // Using scanner again. Don't forget to close BEFORE METHOD!. This is very similar to 7lab5.
    // Just adding method.
    Scanner scanner = new Scanner(System.in);
    
    int selection;

    while(true){
    
      // Method.
      printMenu();

      // looking for answer
      selection = scanner.nextInt();

      // choices for answer
      
      if (selection == 1) {
        System.out.println("Hello Human");
      } else if (selection == 2) {
        System.out.println("Apples, Bananas, Coconuts");
      } else if (selection == 3) {
        System.out.println("Goodbye");
        break;
      }
    }

    scanner.close();

  }
 
  // Looking back at 7lab5 for posting.
  // Our second method area.
 
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}