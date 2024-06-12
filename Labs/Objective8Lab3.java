public class Objective8Lab3 {
  public static void main(String[] args) {
    // another odd/even
    int counter = 1;
      // the 1-20
    for (int controlVar = 1; controlVar <= 20; controlVar ++) {
      counter = controlVar;
      // for the 1-20 each identified as odd/even.
      if (counter % 2 == 0) {
        System.out.println(counter + " is even");
      } else {
        System.out.println(counter + " is odd");
      }
    }
  }
}