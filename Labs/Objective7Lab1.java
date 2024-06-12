public class Objective7Lab1 {
  public static void main(String[] args) {
      //There are two differences between while loops and if statements:
     //A while loop uses the word while instead of if before its condition.
      //An if statement will only execute once if its condition is true, 
      //but a while loop will continue executing and checking its condition until it is no longer true.
    // How many times while
    int counter = 10;
    // meets this objective.
    while(counter > 0) {
      System.out.println(counter);
      counter = counter - 1; 
    }
  }
}