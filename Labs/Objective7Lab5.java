import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    
    // Back to using scanner. Make sure to close at end.
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      // Excat text being printed as usual.
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();
      // Waiting for input
      selection = scanner.nextInt();
      // With this type of input it's multiple options. 1 or 2 or 3 = answer.
      // A repeat until targeted answer with an end result is chosen.

      if (selection == 1) {
        System.out.println("Hello Human");
      } else if (selection == 2) {
        System.out.println("Apples, Bananas, Coconuts");
      } else if (selection == 3) {
        System.out.println("Goodbye");
        break;
      } 
    }
      // End of scanner.
    scanner.close();
  }
}