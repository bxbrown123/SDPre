public class Objective7Lab3 {
  public static void main(String[] args) {
    // Doing evens and odds again but with a range.
    // Alternating between odd/even 1-20. Using % for odd/even.
    //Start.
    int counter = 1;
    //Range.
    while(counter <= 20) {
    //Even/Odd Question.
      if (counter % 2 == 0) {
    //Answer.
        System.out.println(counter + " is even");
      } else {
        System.out.println(counter + " is odd");
      }
    counter = counter + 1;
    }
  }
}