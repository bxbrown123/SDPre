import java.util.Scanner;
import java.time.Year;

public class Objective4Lab3 {
  public static void main(String[] args) {
    
    // the ints that'll be used this time.
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    // Question.
    System.out.println("How old are you?");
    // Answer.
    age = input.nextInt();

    //This is from the other java import.
    currentYear = Year.now().getValue();

    // Formula for answer.
    birthYear = currentYear - age;

    // Answer.
    System.out.println("You were born in " + birthYear);

    // End of scanner.
    input.close();

  }
}